package com.outfit.OutfitAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    
//    public Category saveCategory(Category category) {
//        return categoryRepository.save(category);
//    }
    
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
