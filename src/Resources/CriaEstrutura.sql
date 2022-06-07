/*  Autor: Matias Batista 
    Criado Em: 04/06/2022
*/

CREATE DATABASE EcommerceMotos;

USE EcommerceMotos;

CREATE TABLE Categorias (
Id int not null auto_increment primary key,
Nome varchar(30),
Descricao varchar(180)
)

create table Produtos 
(
	IdProduto int auto_increment primary key not null,
    Descricao varchar(100),
    Quantidade int,
    Valor decimal(8,2)
);
create table Clientes 
(
    IdCliente int auto_increment primary key not null,
    Nome varchar(40) not null,
    CPF varchar(11) not null,
    Endereco varchar(150),
    Email varchar(50) not null,
    Telefone varchar(11),
    Senha varchar(30) not null,
    Usuario varchar(30) not null
);