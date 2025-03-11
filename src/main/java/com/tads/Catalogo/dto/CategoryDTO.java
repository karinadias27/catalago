package com.tads.Catalogo.dto;

import com.tads.Catalago.entities.Category;

public class CategoryDTO {
	private long id;
	private String name;
	
	
	public CategoryDTO() {
		
	}


	public CategoryDTO(long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
};
	