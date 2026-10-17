-- =========================================================================
-- GLOSSÁRIO COMPLETO DE COMANDOS SQL (GUIA DE REFERÊNCIA PRÁTICA)
-- =========================================================================
-- Este documento está dividido por categorias de comandos:
-- 1. DDL (Data Definition Language) - Estrutura do Banco
-- 2. DML (Data Manipulation Language) - Inserção, Atualização e Exclusão
-- 3. DQL (Data Query Language) - Consultas e Seleções
-- 4. TCL (Transaction Control Language) - Controle de Transações
-- 5. DCL (Data Control Language) - Controle de Acesso e Permissões
-- =========================================================================


-- =========================================================================
-- 1. DDL - LINGUAGEM DE DEFINIÇÃO DE DADOS (Estrutura)
-- =========================================================================

-- Cria um novo banco de dados no SGBD
CREATE DATABASE nome_do_banco;

-- Seleciona qual banco de dados será utilizado nas operações seguintes
USE nome_do_banco;

-- Apaga um banco de dados e todos os seus dados permanentemente
DROP DATABASE nome_do_banco;

-- Criação de uma tabela com tipos de dados, chaves primárias e estrangeiras
CREATE TABLE clientes (
    codigoCliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    dataCadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Modifica a estrutura de uma tabela existente (ALTER TABLE)
ALTER TABLE clientes ADD telefone VARCHAR(15);         -- Adiciona nova coluna
ALTER TABLE clientes DROP COLUMN telefone;             -- Remove uma coluna
ALTER TABLE clientes MODIFY email VARCHAR(150);        -- Altera o tipo de dado
ALTER TABLE clientes CHANGE email contatoEmail VARCHAR(150); -- Renomeia coluna e altera tipo
ALTER TABLE clientes RENAME TO usuarios;               -- Renomeia a tabela
ALTER TABLE usuarios RENAME TO clientes;               -- Retorna o nome original

-- Apaga uma tabela inteira (estrutura e dados) do banco
DROP TABLE clientes;

-- Comandos de Inspeção e Metadados
DESC clientes;                 -- Mostra a estrutura das colunas
SHOW TABLES;                   -- Lista todas as tabelas do banco
SHOW COLUMNS FROM clientes;    -- Detalha as colunas da tabela
SHOW KEYS FROM clientes;       -- Mostra chaves primárias e índices


-- =========================================================================
-- 2. DML - LINGUAGEM DE MANIPULAÇÃO DE DADOS (Registros)
-- =========================================================================

-- INSERIR dados em uma tabela (INSERT INTO)
INSERT INTO clientes (nome, email) VALUES ('Ana Silva', 'ana@email.com');

-- Inserção de múltiplos registros de uma vez só
INSERT INTO clientes (nome, email) VALUES 
('Carlos Souza', 'carlos@email.com'),
('Mariana Lima', 'mariana@email.com');

-- ATUALIZAR dados existentes (UPDATE ... SET)
-- ATENÇÃO: Sempre use o WHERE para não atualizar a tabela inteira!
UPDATE clientes 
SET email = 'ana.silva@novoemail.com' 
WHERE codigoCliente = 1;

-- EXCLUIR registros de uma tabela (DELETE FROM)
-- ATENÇÃO: O WHERE evita apagar todos os dados da tabela.
DELETE FROM clientes 
WHERE codigoCliente = 3;


-- =========================================================================
-- 3. DQL - LINGUAGEM DE CONSULTA DE DADOS (SELECT)
-- =========================================================================

-- Seleciona todas as colunas e registros de uma tabela
SELECT * FROM clientes;

-- Seleciona colunas específicas com filtro (WHERE)
SELECT nome, email FROM clientes WHERE codigoCliente = 1;

-- Ordenação de resultados (ORDER BY ASC para crescente, DESC para decrescente)
SELECT * FROM clientes ORDER BY nome ASC;

-- Limitação da quantidade de registros retornados (LIMIT)
SELECT * FROM clientes LIMIT 5;

-- Filtrando com operadores lógicos (AND, OR, NOT)
SELECT * FROM clientes WHERE nome LIKE 'Ana%' AND codigoCliente > 0;

-- Funções de Agregação (COUNT, SUM, AVG, MAX, MIN)
SELECT COUNT(*) AS total_clientes FROM clientes;
SELECT MAX(codigoCliente) AS ultimo_codigo FROM clientes;

-- Agrupamento de dados (GROUP BY) e filtro de grupos (HAVING)
-- Exemplo: Contar quantos clientes existem por cidade
SELECT cidade, COUNT(*) AS qtd 
FROM clientes 
GROUP BY cidade 
HAVING qtd > 1;

-- Junção de Tabelas (JOINS) para cruzar dados relacionados
-- INNER JOIN: Retorna apenas os registros que possuem correspondência em ambas as tabelas
SELECT p.codigoPedido, c.nome, p.dataPedido
FROM Pedidos p
INNER JOIN clientes c ON p.codigoCliente = c.codigoCliente;

-- LEFT JOIN: Retorna todos os registros da tabela da esquerda, mesmo sem correspondência na direita
SELECT clientes.nome, Pedidos.codigoPedido
FROM clientes
LEFT JOIN Pedidos ON clientes.codigoCliente = Pedidos.codigoCliente;


-- =========================================================================
-- 4. TCL - CONTROLE DE TRANSAÇÕES (Integridade de Operações)
-- =========================================================================

-- Inicia uma transação explícita
START TRANSACTION;

-- Comandos DML executados aqui...
UPDATE contas SET saldo = saldo - 100 WHERE id = 1;
UPDATE contas SET saldo = saldo + 100 WHERE id = 2;

-- Se tudo ocorreu bem, efetiva as alterações permanentemente no banco
COMMIT;

-- Se algo deu errado, desfaz todas as alterações feitas na transação atual
ROLLBACK;


-- =========================================================================
-- 5. DCL - CONTROLE DE ACESSO E PERMISSÕES (Segurança)
-- =========================================================================

-- Cria um novo usuário no banco de dados
CREATE USER 'usuario_app'@'localhost' IDENTIFIED BY 'senha_segura123';

-- Concede privilégios específicos a um usuário (ex: SELECT e INSERT)
GRANT SELECT, INSERT ON kevynboom.* TO 'usuario_app'@'localhost';

-- Remove privilégios concedidos anteriormente
REVOKE INSERT ON kevynboom.* FROM 'usuario_app'@'localhost';

-- Aplica as alterações de privilégios imediatamente
FLUSH PRIVILEGES;

-- Remove o usuário do servidor
DROP USER 'usuario_app'@'localhost';