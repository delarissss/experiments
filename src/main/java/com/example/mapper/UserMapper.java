package com.example.mapper;

import com.example.entity.User;
import com.example.dto.UserDTO;

public class UserMapper {
    
    // Convert Entity to DTO
    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }
        
        return new UserDTO(
            user.getId(),
            user.getUsername(),
            user.getEmail(),
            user.getFirstName(),
            user.getLastName(),
            user.getAge()
        );
    }
    
    // Convert DTO to Entity
    public static User toEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        
        return new User(
            userDTO.getId(),
            userDTO.getUsername(),
            userDTO.getEmail(),
            userDTO.getFirstName(),
            userDTO.getLastName(),
            userDTO.getAge()
        );
    }
}