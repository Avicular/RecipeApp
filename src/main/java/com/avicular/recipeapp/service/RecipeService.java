package com.avicular.recipeapp.service;

import java.util.List;

import com.avicular.recipeapp.entity.Recipe;

public interface RecipeService {

	public List<Recipe> findAll();
	
	public Recipe findById(int theId);
	
	public void save(Recipe theRecipe);
	
	public void deleteById(int theId);
}
