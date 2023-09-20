package org.example.model;

import jakarta.persistence.*;

import java.time.Duration;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "recipe_ingredient",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<Ingredient> ingredients;

    @Column
    private String url;

    //TODO
    //@Column(name="preparation_time")
    //private Duration prepTime;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
