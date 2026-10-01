CREATE DATABASE kevynboom;

USE kevynboom;

CREATE TABLE vendedores (
    codigoVendedor INT PRIMARY KEY,
    nome VARCHAR(50),
    salarioFixo dec(10,4)
);

CREATE TABLE produtos (
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