package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food food = new Food(data);
        repository.save(food);
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = repository.findAll()
                .stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

}
