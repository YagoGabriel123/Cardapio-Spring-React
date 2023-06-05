package com.yago.cardapio.controller;

import com.yago.cardapio.food.Food;
import com.yago.cardapio.food.FoodRepository;
import com.yago.cardapio.food.FoodRequestDTO;
import com.yago.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Define a classe como controller
@RequestMapping("food")//Mapeia o request "food"

public class FoodController {
    @Autowired//Injeta as dependencias necessarias na classe
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")// Permite acesso de qualquer origem
    @PostMapping//requisição do tipo Post
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);//
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*") // Permite acesso de qualquer origem
    @GetMapping//requisição do tipo gett
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO:: new).toList();

    return foodList;
    }
}
