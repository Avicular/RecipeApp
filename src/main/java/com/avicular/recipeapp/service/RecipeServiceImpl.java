package com.avicular.recipeapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicular.recipeapp.dao.RecipeRepository;
import com.avicular.recipeapp.entity.Recipe;

@Service
public class RecipeServiceImpl implements RecipeService {

	private RecipeRepository recipeRepository;
	
	@Autowired
	public RecipeServiceImpl(RecipeRepository theRecipeRepository) {
		recipeRepository = theRecipeRepository;
	}
	

	@Override
	public Recipe findById(int theId) {
		Optional<Recipe> result = recipeRepository.findById(theId);
		
		Recipe theRecipe = null;
		if(result.isPresent()) {
			theRecipe = result.get();
		}
		else {
			// we didn't find the recipe
			throw new RuntimeException("Did not find recipe id - " + theId);
		}
		return theRecipe;
	}

	@Override
	public void save(Recipe theRecipe) {
		recipeRepository.save(theRecipe);

	}

	@Override
	public void deleteById(int theId) {
		recipeRepository.deleteById(theId);

	}


	@Override
	public List<Recipe> findAll() {
		return recipeRepository.findAll();
	}

}
