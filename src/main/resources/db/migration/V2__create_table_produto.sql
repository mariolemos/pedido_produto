create table if not exists `PRODUTO`(
    ID bigint not null auto_increment primary key,
    NOME VARCHAR(100),
    PRECO DOUBLE,
    CATEGORIA_ID bigint,

    foreign key (CATEGORIA_ID) references CATEGORIA(ID)
    );
