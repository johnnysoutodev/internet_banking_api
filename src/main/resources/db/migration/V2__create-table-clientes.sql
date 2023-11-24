create table clientes(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    data_de_nascimento varchar(100) not null,
    numero_da_conta varchar(6) not null unique,
    plano_exclusive boolean not null,
    saldo float not null,

    primary key(id)
);