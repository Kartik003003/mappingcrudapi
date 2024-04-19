package com.outfit.OutfitAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<CategoryProduct , Long> {
}
