create  database bdnewbank;
use bdnewbank;
create table tb_conta_corrente(
numero integer not null,
saldo double,
primary key (numero));

create table tb_conta_especial(
numero integer not null,
saldo double,
primary key (numero));

describe tb_conta_corrente