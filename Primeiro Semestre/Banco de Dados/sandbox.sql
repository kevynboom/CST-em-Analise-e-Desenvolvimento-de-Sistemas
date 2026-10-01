CREATE DATABASE kevynboom;
USE kevynboom;

CREATE TABLE sandbox (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE,
    idade INT,
    ativo BOOLEAN DEFAULT TRUE,
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO sandbox (nome, email, idade, ativo)
VALUES
    ('João Silva', 'joao.silva@email.com', 25, TRUE),
    ('Maria Santos', 'maria.santos@email.com', 30, TRUE),
    ('Pedro Oliveira', 'pedro.oliveira@email.com', 22, TRUE),
    ('Ana Costa', 'ana.costa@email.com', 28, TRUE),
    ('Carlos Souza', 'carlos.souza@email.com', 35, FALSE),
    ('Juliana Almeida', 'juliana.almeida@email.com', 26, TRUE),
    ('Lucas Pereira', 'lucas.pereira@email.com', 31, TRUE),
    ('Fernanda Lima', 'fernanda.lima@email.com', 24, FALSE),
    ('Rafael Gomes', 'rafael.gomes@email.com', 40, TRUE),
    ('Beatriz Rocha', 'beatriz.rocha@email.com', 29, TRUE);
