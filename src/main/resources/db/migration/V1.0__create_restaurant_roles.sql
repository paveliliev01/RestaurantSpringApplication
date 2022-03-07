create table role(
 id serial,
 role_name varchar(250),
 primary key(id)
);

insert into role(role_name)
     values('ADMIN');

insert into role(role_name)
     values('USER');

