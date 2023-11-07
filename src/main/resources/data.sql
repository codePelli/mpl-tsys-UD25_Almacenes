drop database if exists ud14_ejercicio05;
create database if not exists ud14_ejercicio05;
use ud14_ejercicio05;

CREATE TABLE almacen (
    codigo INT PRIMARY KEY,
    lugar NVARCHAR(100),
    capacidad INT
);

CREATE TABLE caja (
    num_referencia CHAR(5) PRIMARY KEY,
    contenido NVARCHAR(100),
    valor INT,
    almacen INT,
    FOREIGN KEY (almacen)
        REFERENCES almacen (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacen (codigo, lugar, capacidad) VALUES (1, 'Almacen A', 1000);
INSERT INTO almacen (codigo, lugar, capacidad) VALUES (2, 'Almacen B', 2000);
INSERT INTO caja (num_referencia, contenido, valor, almacen) VALUES ('C001', 'Contenido', 500, 1);
INSERT INTO caja (num_referencia, contenido, valor, almacen) VALUES ('C002', 'Contenido2', 750, 2);
