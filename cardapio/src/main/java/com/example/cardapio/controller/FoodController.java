package com.example.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
@RestController
@RequestMapping("food")
public class FoodController {

    @GetMapping
    public void getAll(){

    }

}
