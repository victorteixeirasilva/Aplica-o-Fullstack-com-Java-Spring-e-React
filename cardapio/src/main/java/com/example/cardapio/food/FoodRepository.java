package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public interface FoodRepository extends JpaRepository<Food, Long> {
}
