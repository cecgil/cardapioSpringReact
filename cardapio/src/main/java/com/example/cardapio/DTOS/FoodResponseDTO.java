package com.example.cardapio.DTOS;

import com.example.cardapio.domain.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
