package com.sangura.cooking_recipes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangura.cooking_recipes.entities.Recipes;

public interface RecipesRepo extends JpaRepository<Recipes, Integer>{

}
