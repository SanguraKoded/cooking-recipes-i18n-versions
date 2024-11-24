package com.sangura.cooking_recipes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String cuisine;
	
	@Column(nullable=false)
	private String ingredients;
	
	@Column(nullable=false)
	private String time;
	
	@Column(nullable=false)
	private String instructions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	

	public Recipes(int id, String name, String cuisine, String ingredients, String time, String instructions) {
		super();
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
		this.ingredients = ingredients;
		this.time = time;
		this.instructions = instructions;
	}
	
	

	@Override
	public String toString() {
		return "Recipes [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", ingredients=" + ingredients
				+ ", time=" + time + ", instructions=" + instructions + "]";
	}
	
	public Recipes() {
		
	}
	
	
	
	
	

}
