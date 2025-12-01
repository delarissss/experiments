package com.example;

import com.example.entity.User;
import com.example.entity.Product;
import com.example.entity.Order;
import com.example.dto.UserDTO;
import com.example.dto.ProductDTO;
import com.example.dto.OrderDTO;
import com.example.mapper.UserMapper;
import com.example.mapper.ProductMapper;
import com.example.mapper.OrderMapper;

import java.time.LocalDateTime;

public class DemoApplication {
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Entity-DTO-Mapper structure:");
        
        // Create entities
        User user = new User(1L, "john_doe", "john@example.com", "John", "Doe", 30);
        Product product = new Product(1L, "Laptop", "Gaming laptop", 1299.99, "Electronics", 10);
        Order order = new Order(1L, 1L, 1L, 1, 1299.99, LocalDateTime.now(), "PENDING");
        
        System.out.println("\nOriginal Entities:");
        System.out.println("User: " + user.getUsername() + " (" + user.getEmail() + ")");
        System.out.println("Product: " + product.getName() + " - $" + product.getPrice());
        System.out.println("Order: ID " + order.getId() + ", Status: " + order.getStatus());
        
        // Convert entities to DTOs
        UserDTO userDTO = UserMapper.toDTO(user);
        ProductDTO productDTO = ProductMapper.toDTO(product);
        OrderDTO orderDTO = OrderMapper.toDTO(order);
        
        System.out.println("\nConverted to DTOs:");
        System.out.println("UserDTO: " + userDTO.getUsername() + " (" + userDTO.getEmail() + ")");
        System.out.println("ProductDTO: " + productDTO.getName() + " - $" + productDTO.getPrice());
        System.out.println("OrderDTO: ID " + orderDTO.getId() + ", Status: " + orderDTO.getStatus());
        
        // Convert DTOs back to entities
        User userFromDTO = UserMapper.toEntity(userDTO);
        Product productFromDTO = ProductMapper.toEntity(productDTO);
        Order orderFromDTO = OrderMapper.toEntity(orderDTO);
        
        System.out.println("\nConverted back from DTOs to Entities:");
        System.out.println("User: " + userFromDTO.getUsername() + " (" + userFromDTO.getEmail() + ")");
        System.out.println("Product: " + productFromDTO.getName() + " - $" + productFromDTO.getPrice());
        System.out.println("Order: ID " + orderFromDTO.getId() + ", Status: " + orderFromDTO.getStatus());
        
        System.out.println("\nEntity-DTO-Mapper structure successfully implemented!");
    }
}