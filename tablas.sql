use dbasepapw;

create table Direccion(
ID int primary key,
CALLE varchar(50),
CP int,
ESTADO varchar(50),
NUMERO int,
COLONIA varchar(50),
MUNICIPIO varchar(50)
);

create table usuario (
ID int primary key,
nombre varchar(50),
apellido varchar(50),
correo varchar(50),
contraseña varchar(50),
nick varchar(50),
telefono int
);

create table imagen(
ID int primary key,
nombre varchar(50),
extension varchar(50)
);

create table video(
ID int primary key,
nombre varchar(50),
extension varchar(50),
ruta varchar(50)
);

create table compra(
ID int primary key,
fecha date,
subtotal int,
descuento int,
total int
);

create table producto(
id int primary key,
descripcion varchar(50),
precio int,
nombre varchar(50),
unidades int
);

create table categoria(
ID int primary key,
nombre varchar(50)
);

create table tiene(
IDCOMPRA int,
IDPRODUCTO int,
cantidad int,
CONSTRAINT IDCOMPRA FOREIGN KEY (IDCOMPRA)
    REFERENCES compra(ID),
    CONSTRAINT IDPRODUCTO FOREIGN KEY (IDPRODUCTO)
    REFERENCES PRODUCTO(ID)
);