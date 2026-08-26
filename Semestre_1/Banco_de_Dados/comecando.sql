-- Ainda não fizemos nenhum exercício, abaixo é apenas um template de um slide

CREATE TABLE turma ( 
idturma INTEGER(4) NOT NULL AUTO_INCREMENT, 
capacidade INTEGER(2) NOT NULL, 
idProfessor INTEGER(4) NOT NULL, 
PRIMARY KEY (idturma), 
FOREIGN KEY (idProfessor) REFERENCES 
professor(idProfessor), UNIQUE KEY idturma
(idturma) 
);
CREATE TABLE professor ( 
idProfessor INTEGER(4) NOT NULL AUTO_INCREMENT, 
telefone INTEGER(10) NOT NULL, 
nome CHAR(80) COLLATE NOT NULL DEFAULT ‘’, 
PRIMARY KEY (idProfessor), 
FOREIGN KEY(idTurma) REFERENCES turma(idturma), 
UNIQUE KEY idProfessor (idProfessor) 
); 