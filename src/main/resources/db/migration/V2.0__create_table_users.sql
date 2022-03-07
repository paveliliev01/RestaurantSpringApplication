create table if not exists users(
 user_id serial not null,
 user_name varchar(250) not null ,
 user_email varchar (255) not null unique,
 password varchar(250) not null,
 soft_delete int not null default 0,
 primary key(user_id)
);
