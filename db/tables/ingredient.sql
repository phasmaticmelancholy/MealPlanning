create table if not exists ingredient(
    ingredient_id int generated always as identity,
    name varchar(50) not null,
    status varchar(10) not null,
    primary key(ingredient_id),
    unique(name, status)
)
