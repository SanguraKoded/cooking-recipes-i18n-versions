package com.sangura.cooking_recipes.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangura.cooking_recipes.service.RecipesService;

@RestController
@RequestMapping("/recipes")
public class RecipesController {
	
	@Autowired
	RecipesService recipesService;
	
	private MessageSource messageSource;
	
	public RecipesController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	@GetMapping(params="version=1")
	public ResponseEntity<Map<String, Object>> getAllRecipesV1DTO(){
		
		Locale locale = LocaleContextHolder.getLocale();
		Map<String, Object> recipes = new HashMap<>();
		recipes.put(messageSource.getMessage("recipe.name", null, locale), messageSource.getMessage("recipe1.name", null, locale));
		recipes.put(messageSource.getMessage("recipe.cuisine", null, locale), messageSource.getMessage("recipe1.cuisine",null, locale));
		return ResponseEntity.ok(recipes);
		
	}
	
	@GetMapping(params="version=2")
	public ResponseEntity<Map<String, Object>> getAllRecipesV2DTO(){
		Locale locale = LocaleContextHolder.getLocale();
		
		Map<String, Object> recipes = new HashMap<>();
		recipes.put("Welcome message", messageSource.getMessage("welcome.message", null, locale));
		recipes.put(messageSource.getMessage("recipe.name", null, locale), messageSource.getMessage("recipe1.name", null, locale));
		recipes.put(messageSource.getMessage("recipe.ingredients", null, locale), messageSource.getMessage("recipe1.ingredients", null, locale));
		recipes.put(messageSource.getMessage("recipe.instructions", null, locale), messageSource.getMessage("recipe1.instructions", null, locale));
		return ResponseEntity.ok(recipes);
	}
	
	@GetMapping()
	public  ResponseEntity<Map<String, Object>> getAllRecipes(){
		Locale locale = LocaleContextHolder.getLocale();
		
		Map<String, Object> recipes = new HashMap<>();
		recipes.put("Welcome message", messageSource.getMessage("welcome.message", null, locale));
		recipes.put(messageSource.getMessage("recipe.name", null, locale), messageSource.getMessage("recipe1.name", null, locale));
		recipes.put(messageSource.getMessage("recipe.cuisine", null, locale), messageSource.getMessage("recipe1.cuisine",null, locale));
		recipes.put(messageSource.getMessage("recipe.ingredients", null, locale), messageSource.getMessage("recipe1.ingredients", null, locale));
		recipes.put(messageSource.getMessage("recipe.instructions", null, locale), messageSource.getMessage("recipe1.instructions", null, locale));
		recipes.put(messageSource.getMessage("recipe.time", null, locale), messageSource.getMessage("recipe1.time",null, locale));
		return ResponseEntity.ok(recipes);
	}
			
}
