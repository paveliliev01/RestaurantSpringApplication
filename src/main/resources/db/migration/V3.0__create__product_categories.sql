create table if not exists product_categories(
 id serial not null,
 category_name varchar(100) not null unique,
 primary key(id)
);
