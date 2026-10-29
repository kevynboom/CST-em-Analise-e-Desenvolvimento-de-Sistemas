-- Criando e usando o DB
CREATE DATABASE kevynboom;
USE kevynboom;

-- Template das tables
CREATE TABLE Vendedores (
    codigoVendedor INT PRIMARY KEY,
    nome VARCHAR(50),
    salarioFixo dec(10,4)
);

CREATE TABLE Produtos (
    codigoProduto INT PRIMARY KEY,
    nome VARCHAR(50),
    precoUnitario dec(10,4),
    quantidadeEstoque int
);

CREATE TABLE Clientes (
    CodigoCliente INTEGER PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(50) NOT NULL,
    Logradouro VARCHAR(50),
    Numero VARCHAR(8),
    Bairro VARCHAR(50),
    CEP CHAR(8),
    Cidade VARCHAR(20),
    UF CHAR(2),
    CNPJ CHAR(14),
    IE VARCHAR(20)
);

CREATE TABLE Pedidos (
    codigoPedido INTEGER PRIMARY KEY AUTO_INCREMENT,
    dataPedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    dataEntrega DATETIME,
    codigoVendedor INTEGER NOT NULL,
    codigoCliente INTEGER NOT NULL,

    CONSTRAINT fk_pedido_vendedor
        FOREIGN KEY (codigoVendedor)
        REFERENCES Vendedores(codigoVendedor),

    CONSTRAINT fk_pedido_cliente
        FOREIGN KEY (codigoCliente)
        REFERENCES Clientes(CodigoCliente)
);

CREATE TABLE ItemPedidos (
    codigoProduto INTEGER NOT NULL,
    codigoPedido INTEGER NOT NULL,
    quantidade INTEGER NOT NULL,

    PRIMARY KEY (codigoProduto, codigoPedido),

    CONSTRAINT fk_item_produto
        FOREIGN KEY (codigoProduto)
        REFERENCES Produtos(codigoProduto),

    CONSTRAINT fk_item_pedido
        FOREIGN KEY (codigoPedido)
        REFERENCES Pedidos(codigoPedido)
);

-- Mais comandos SQL
ALTER TABLE clientes ADD statusCliente BIT;

ALTER TABLE clientes DROP COLUMN statusCliente;

ALTER TABLE clientes MODIFY statusCliente CHAR(2);

ALTER TABLE clientes CHANGE statusCliente stcliente BIT; 

ALTER TABLE clientes RENAME TO pessoas;
ALTER TABLE pessoas RENAME TO clientes; 

DESC cliente;

SHOW KEYS FROM clientes;

SHOW TABLES;

SHOW COLUMNS FROM clientes;

SHOW INDEX FROM clientes;

INSERT INTO Produtos (codigoProduto, nome, precoUnitario, quantidadeEstoque)
    VALUES (1, 'DVD', 100.44, 100), (2, 'Radio', 50.88, 50), (3, 'MP3', 99.33, 115), (4, 'Televisão', 1000.99, 66);

SELECT * FROM produtos;

UPDATE produtos SET precoUnitario = 199.44 WHERE codigoProduto = 1;
UPDATE produtos SET precoUnitario = 199.44, nome = 'BlueRay' WHERE codigoProduto = 1;

DELETE FROM produtos WHERE `codigoProduto` = 4;
DELETE FROM produtos WHERE `codigoProduto` IN (1,4);

DELETE FROM produtos WHERE codigoProduto BETWEEN 1 AND 4;