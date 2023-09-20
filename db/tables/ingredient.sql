create table if not exists ingredient(
    ingredient_id int generated always as identity,
    name varchar(50),
    status varchar(10),
    primary key(ingredient_id),
    unique(name, status)
)
