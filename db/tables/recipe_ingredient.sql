create table if not exists recipe_ingredient(
    ingredient_id int,
    recipe_id int,
    constraint fk_ingredient foreign key (ingredient_id) references ingredient(ingredient_id),
    constraint fk_recipe foreign key (recipe_id) references recipe(recipe_id),
    primary key(ingredient_id, recipe_id)
)
