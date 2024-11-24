package com.sangura.cooking_recipes.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RecipesV1DTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String cuisine;

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

	public RecipesV1DTO(int id, String name, String cuisine) {
		super();
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "RecipesVersion1 [id=" + id + ", name=" + name + ", cuisine=" + cuisine + "]";
	}
	
	
	

}
