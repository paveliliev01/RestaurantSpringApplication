create table if not exists orders(
order_id serial,
table_id int not null,
waiter_id int not null,
order_status int not null,
order_date date not null,
primary key(order_id),
  constraint fk_table_id
      foreign key(table_id)
	  references restaurant_tables(table_id) on delete cascade on update cascade,
  constraint fk_waiter_id
      foreign key(waiter_id)
      references users(user_id) on delete cascade on update cascade
);
