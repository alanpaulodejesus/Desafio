create database BancoNomeProjeto;

use BancoNomeProjeto;
create table TabelaNomeProjeto(
id INT,
nome varchar(20)
);

insert into TabelaNomeProjeto
(id, nome)
values
('1','TESTE123');

select * from TabelaNomeProjeto;