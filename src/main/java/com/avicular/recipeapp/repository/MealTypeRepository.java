package com.avicular.recipeapp.repository;

import com.avicular.recipeapp.entity.MealType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealTypeRepository extends JpaRepository<MealType, Long> {
}
