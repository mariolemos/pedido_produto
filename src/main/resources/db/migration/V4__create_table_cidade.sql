create table if not exists `CIDADE`(
    ID bigint not null auto_increment primary key,
    NOME VARCHAR(100),
    ESTADO_ID bigint,

    foreign key (ESTADO_ID) references ESTADO(ID)
    );
