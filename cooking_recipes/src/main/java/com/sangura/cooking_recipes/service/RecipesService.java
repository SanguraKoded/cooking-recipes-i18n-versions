package com.sangura.cooking_recipes.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangura.cooking_recipes.DTO.RecipesV1DTO;
import com.sangura.cooking_recipes.DTO.RecipesV2DTO;
import com.sangura.cooking_recipes.entities.Recipes;
import com.sangura.cooking_recipes.repo.RecipesRepo;

@Service
public class RecipesService {
	
	
	@Autowired
	RecipesRepo recipesRepo;
	
	
	public List<Recipes> getAllRecipes(){
		return recipesRepo.findAll();
	}
	
	public List<RecipesV1DTO> getAllRecipesV1(){
		List<Recipes> recipes = recipesRepo.findAll();		
		return recipes.stream().map(e -> new RecipesV1DTO(e.getId(), e.getName(), e.getCuisine())).collect(Collectors.toList());
	}

	public List<RecipesV2DTO> getAllRecipesV2(){
		List<Recipes> recipes = recipesRepo.findAll();
		return recipes.stream().map(e -> new RecipesV2DTO(e.getId(), e.getName(), e.getTime(), e.getIngredients(),e.getInstructions())).collect(Collectors.toList());
		
	}
}
