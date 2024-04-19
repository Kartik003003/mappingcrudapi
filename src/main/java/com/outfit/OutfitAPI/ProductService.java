package com.outfit.OutfitAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public CategoryProduct  saveProduct(CategoryProduct  product) {
//    	System.out.println("nimooooo"+product.getVendor());
        return productRepository.save(product);
    }
}

