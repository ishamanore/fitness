package com.diet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class diet {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private byte[] image;
    private String filterClass;
    private String title;
    private String category;
    private String ingredients;
    private String instruction;
  

    
	
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
	

    public diet(int id, byte[] image, String filterClass, String title, String category, String ingredients,
			String instruction) {
		super();
		this.id = id;
		this.image = image;
		this.filterClass = filterClass;
		this.title = title;
		this.category = category;
		this.ingredients = ingredients;
		this.instruction = instruction;
	}
	public diet() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}
