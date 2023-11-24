CREATE TABLE CLIENTES (
    id integer not null auto_increment,
    nome varchar(100) not null,
    data_de_nascimento varchar(12) not null,
    numero_da_conta integer not null,
    plano_exclusive boolean not null,
    saldo float not null,
    primary key (id)
);