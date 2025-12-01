package com.example.mapper;

import com.example.entity.Order;
import com.example.dto.OrderDTO;

public class OrderMapper {
    
    // Convert Entity to DTO
    public static OrderDTO toDTO(Order order) {
        if (order == null) {
            return null;
        }
        
        return new OrderDTO(
            order.getId(),
            order.getUserId(),
            order.getProductId(),
            order.getQuantity(),
            order.getTotalPrice(),
            order.getOrderDate(),
            order.getStatus()
        );
    }
    
    // Convert DTO to Entity
    public static Order toEntity(OrderDTO orderDTO) {
        if (orderDTO == null) {
            return null;
        }
        
        return new Order(
            orderDTO.getId(),
            orderDTO.getUserId(),
            orderDTO.getProductId(),
            orderDTO.getQuantity(),
            orderDTO.getTotalPrice(),
            orderDTO.getOrderDate(),
            orderDTO.getStatus()
        );
    }
}