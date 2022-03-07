CREATE TABLE IF NOT EXISTS products_in_order(
order_id int not null,
product_id int not null,
 CONSTRAINT fk_order_id
      FOREIGN KEY(order_id)
	  REFERENCES orders(order_id)  ON DELETE CASCADE ON UPDATE CASCADE,
 CONSTRAINT fk_product_id
      FOREIGN KEY(product_id)
	  REFERENCES products(product_id)  ON DELETE CASCADE ON UPDATE CASCADE,
	  primary key(order_id,product_id)
);
