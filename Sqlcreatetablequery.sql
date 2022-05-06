

create table product
( 
	productId int primary key auto_increment,
	productName varchar(30) not null,
	productPrice int not null,
	productQuantity int not null 
);