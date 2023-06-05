package com.yago.cardapio.food;
public record FoodResponseDTO(Long id, String title, String image, Integer price ) {// define o record e suas propriedades

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
