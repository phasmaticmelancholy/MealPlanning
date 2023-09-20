package org.example.controller;

import org.example.model.Recipe;
import org.example.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    
    @Autowired
    private RecipeRepository recipeRepo;
    
    @GetMapping(value = "/recipes")
    public List<Recipe> greeting() {
        return recipeRepo.findAll();
    }
    
    @GetMapping(value = "/recipes")
    public List<Recipe> greeting(List<String> ingredientNames) {
        //TODO
        return recipeRepo.findAll();
    }
}