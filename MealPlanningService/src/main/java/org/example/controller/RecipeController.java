package org.example.controller;

import org.example.model.Ingredient;
import org.example.model.Recipe;
import org.example.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    
    @Autowired
    private RecipeRepository recipeRepo;
    
    @GetMapping(value = "/recipes")
    public List<Recipe> findAllRecipes() {

        return recipeRepo.findAll();
    }

    @GetMapping(value = "/recipes/ingredients")
    public List<Recipe> findAllRecipesWithIngredients(@RequestParam(name="name") List<String> ingredientNames) {
        List<Ingredient> ingredients = ingredientNames.stream().map(Ingredient::new).toList();
        //TODO There is a better way to do this with Specifications I think
        return recipeRepo.findAll().stream().filter(recipe -> recipe.containsIngredients(ingredientNames)).toList();
    }
}