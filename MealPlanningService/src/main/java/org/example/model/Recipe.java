package org.example.model;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "recipe_ingredient",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private Set<Ingredient> ingredients;

    @Column
    private String url;

    //TODO
    //@Column(name="preparation_time")
    //private Duration prepTime;

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean containsIngredient(String ingredientName)
    {
        return ingredients.contains(new Ingredient(ingredientName));
    }

    public boolean containsIngredients(List<String> ingredientNames)
    {
        boolean foundAllFlag = true;
        for(String ingredientName: ingredientNames)
        {
            if(!containsIngredient(ingredientName))
            {
                foundAllFlag = false;
                break;
            }
        }
        return foundAllFlag;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
