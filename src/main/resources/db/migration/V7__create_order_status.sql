CREATE TABLE IF NOT EXISTS order_status(
status_id int not null,
status varchar(250) not null ,
primary key (status_id)
);

insert into order_status(status_id,status)
     values(1,'COMPLETE');

insert into  order_status(status_id,status)
     values(2,'ACTIVE');

