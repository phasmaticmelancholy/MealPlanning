package org.example.controller;

import org.example.model.Ingredient;
import org.example.model.Recipe;
import org.example.repository.IngredientRepository;
import org.example.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class IngredientController {
    
    @Autowired
    private IngredientRepository repo;
    
    @GetMapping(value = "/ingredients")
    public List<Ingredient> findAllIngredients() {

        return repo.findAll();
    }
}