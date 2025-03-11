package com.tads.Catalago.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tads.Catalago.entities.Category;
import com.tads.Catalago.repositories.CategoryRepository;
import com.tads.Catalogo.dto.CategoryDTO;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	public List<CategoryDTO> findAll(){
		
		
		List<Category> list = repository.findAll();
		
		
		//List<CategoryDTO> listDto = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
				//return listDto;
				
				List<CategoryDTO> listDto = new ArrayList<>();
				for (Category cat : list) {
					listDto.add(new CategoryDTO(cat));
				}
				
				return listDto;
		
	}

}

