package com.seamus.mealPlanner.webservice.service;

import com.seamus.mealPlanner.webservice.domain.Ingredient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {

    public List<Ingredient> getAllIngredients() {
        List<Ingredient> ingredientList= new ArrayList<>();
        Ingredient ingredient = new Ingredient("bread", "bready");
        ingredientList.add(ingredient);

        return ingredientList;
    }
}
