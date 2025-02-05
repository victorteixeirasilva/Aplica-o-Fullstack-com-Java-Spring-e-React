package com.example.cardapio.food;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
