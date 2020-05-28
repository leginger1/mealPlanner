package com.seamus.mealPlanner.webservice.controller;

import com.seamus.mealPlanner.webservice.service.IngredientService;
import com.seamus.mealPlanner.webservice.domain.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping()
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }
}
