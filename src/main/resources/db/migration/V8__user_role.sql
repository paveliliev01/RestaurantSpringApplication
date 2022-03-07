CREATE TABLE IF NOT EXISTS user_roles(
user_id int not null,
role_id int not null,
 CONSTRAINT fk_user_id
      FOREIGN KEY(user_id)
	  REFERENCES users(user_id) ON DELETE CASCADE ON UPDATE CASCADE,
 CONSTRAINT fk_role_id
      FOREIGN KEY(role_id)
	  REFERENCES role(id) ON DELETE CASCADE ON UPDATE CASCADE,
primary key(user_id,role_id)
);
