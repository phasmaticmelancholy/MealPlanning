create table if not exists recipe (
    recipe_id int generated always as identity,
    url varchar,
    preparation_time interval,
    primary key(recipe_id)
)