package com.outfit.OutfitAPI;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String category_name;

	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	    private List<CategoryProduct> category_products;
	   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public List<CategoryProduct> getCategory_products() {
		return category_products;
	}

	public void setCategory_products(List<CategoryProduct> category_products) {
		this.category_products = category_products;
	}


    
}

