create table if not exists recipe (
    recipe_id int generated always as identity,
    name varchar not null,
    url varchar not null,
    preparation_time interval,
    primary key(recipe_id)
)