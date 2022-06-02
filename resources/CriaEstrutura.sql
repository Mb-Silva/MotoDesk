CREATE DATABASE EcommerceMotos;

USE EcommerceMotos;

CREATE TABLE Categorias (
Id int not null auto_increment primary key,
Nome varchar(30),
Descricao varchar(180)
)