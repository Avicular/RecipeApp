package com.avicular.recipeapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "recipe_name")
	private String recipeName;

	@Column(name = "meal_type_id")
	private int mealTypeId;
	
	@Column(name = "catagory_type_id")
	private int categoryId;

	@Column(name = "ingredient_id")
	private int ingredientId;
	
	@Column(name="preparing")
	private String preparing;
	
	public Recipe() {
		
	}

	public Recipe(int id, String recipeName, int mealTypeId, int categoryId, int ingredientId, String preparing) {
		this.id = id;
		this.recipeName = recipeName;
		this.mealTypeId = mealTypeId;
		this.categoryId = categoryId;
		this.ingredientId = ingredientId;
		this.preparing = preparing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getMealTypeId() {
		return mealTypeId;
	}

	public void setMealTypeId(int mealTypeId) {
		this.mealTypeId = mealTypeId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getPreparing() {
		return preparing;
	}

	public void setPreparing(String preparing) {
		this.preparing = preparing;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", recipeName=" + recipeName + ", mealTypeId=" + mealTypeId + ", categoryId="
				+ categoryId + ", ingredientId=" + ingredientId + ", preparing=" + preparing + "]";
	}

	
	
	
}
