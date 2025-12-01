package com.example.mapper;

import com.example.entity.Product;
import com.example.dto.ProductDTO;

public class ProductMapper {
    
    // Convert Entity to DTO
    public static ProductDTO toDTO(Product product) {
        if (product == null) {
            return null;
        }
        
        return new ProductDTO(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getCategory(),
            product.getQuantityInStock()
        );
    }
    
    // Convert DTO to Entity
    public static Product toEntity(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        }
        
        return new Product(
            productDTO.getId(),
            productDTO.getName(),
            productDTO.getDescription(),
            productDTO.getPrice(),
            productDTO.getCategory(),
            productDTO.getQuantityInStock()
        );
    }
}