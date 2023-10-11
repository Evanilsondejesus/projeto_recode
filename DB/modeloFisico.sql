-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE pacotes (
valorTotal VARCHAR(10),
valor VARCHAR(10),
descontos VARCHAR(10),
destino VARCHAR(10),
nomePacote VARCHAR(10),
id_produtor VARCHAR(10) PRIMARY KEY
)

CREATE TABLE pacoteUsuarios (
valorTotal VARCHAR(10),
valor VARCHAR(10),
descontos VARCHAR(10),
nomePacotes VARCHAR(10),
id_produtor VARCHAR(10),
userid VARCHAR(10),
FOREIGN KEY(id_produtor) REFERENCES pacotes (id_produtor)
)

CREATE TABLE Usuario (
email VARCHAR(10),
senha VARCHAR(10),
userid VARCHAR(10) PRIMARY KEY
)

ALTER TABLE pacoteUsuarios ADD FOREIGN KEY(userid) REFERENCES Usuario (userid)
