package com.raizefolha.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.raizefolha.api.model.meal.*;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cardapio")
public class MealController {
    
    @Autowired
    private MealRepository repository;

    @GetMapping("/listar")
    public List <MealModel> mealList() {
        return repository.findAll();
    }

    @PostMapping("/cadastrar")
    public void mealRegister(@RequestBody @Valid RegisterMealData data) {
        repository.save(new MealModel(data));
    }

    @PutMapping
    @Transactional
    public void mealUpdate(@RequestBody UpdateMealData data) {
        MealModel meal = repository.getReferenceById(data.id());
        meal.updateMeal(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void mealDelete (@PathVariable Long id) {
        repository.deleteById(id);
    }
}
