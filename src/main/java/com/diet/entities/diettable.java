package com.diet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class diettable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private byte[] image;
	private String filterClass;
	private String title;
	private String vegNonveg;
	private String category;
	private String ingredients;
	private String instruction;
	private int calories;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getFilterClass() {
		return filterClass;
	}
	public void setFilterClass(String filterClass) {
		this.filterClass = filterClass;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVegNonveg() {
		return vegNonveg;
	}
	public void setVegNonveg(String vegNonveg) {
		this.vegNonveg = vegNonveg;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public diettable(int id, byte[] image, String filterClass, String title, String vegNonveg, String category,
			String ingredients, String instruction, int calories) {
		super();
		this.id = id;
		this.image = image;
		this.filterClass = filterClass;
		this.title = title;
		this.vegNonveg = vegNonveg;
		this.category = category;
		this.ingredients = ingredients;
		this.instruction = instruction;
		this.calories = calories;
	}
	public diettable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
