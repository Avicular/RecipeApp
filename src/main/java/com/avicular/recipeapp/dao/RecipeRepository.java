package com.avicular.recipeapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avicular.recipeapp.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

	public List<Recipe> findAll();


	
}
