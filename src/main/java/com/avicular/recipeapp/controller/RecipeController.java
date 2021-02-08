package com.avicular.recipeapp.controller;

import java.util.List;

import com.avicular.recipeapp.repository.MealTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.avicular.recipeapp.entity.Recipe;
import com.avicular.recipeapp.service.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

	private RecipeService recipeService;
	private MealTypeRepository mealTypeRepository;

	public RecipeController(RecipeService theRecipeService, MealTypeRepository mealTypeRepository) {
		recipeService = theRecipeService;
		this.mealTypeRepository = mealTypeRepository;
	}

	@GetMapping("/list")
	public String listRecipes(Model theModel) {

		List<Recipe> theRecipes = recipeService.findAll();

		theModel.addAttribute("recipes", theRecipes);

		return "recipes/list-recipes";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Recipe theRecipe = new Recipe();

		theModel.addAttribute("recipe", theRecipe);
		theModel.addAttribute("mealTypeList", mealTypeRepository.findAll());


		return "recipes/recipe-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("recipeId") int theId, Model theModel) {

		Recipe theRecipe = recipeService.findById(theId);

		theModel.addAttribute("recipe", theRecipe);

		return "recipes/recipe-form";
	}

	@PostMapping("/save")
	public String saveRecipe(@ModelAttribute("recipe") Recipe theRecipe) {

		recipeService.save(theRecipe);

		return "redirect:/recipes/list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("recipeId") int theId) {

		recipeService.deleteById(theId);

		return "redirect:/recipes/list";
	}

}
