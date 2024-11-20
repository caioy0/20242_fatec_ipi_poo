-- Active: 1731008627561@@127.0.0.1@5432@fatec_ipi_poo_pessoas@public
-- create table th_pessoa(
--     cod_pessoa SERIAL PRIMARY KEY,
--     nome VARCHAR(200),
--     fone VARCHAR(200),
--     email VARCHAR(200)
-- );

-- INSERT INTO th_pessoa (nome, fone, email) VALUES
--     ('Jose', '11994821312', 'jose@email.com');

-- INSERT INTO th_pessoa(nome, fone, email)
-- VALUES
-- ('Joao', '3123333453', 'joao@gmail.com'),
-- ('Maria', '9948291993', 'maria@email.com');

-- SELECT * from th_pessoa;
-- SELECT * from th_pessoa where cod_pessoa = 1;
-- SELECT * from th_pessoa WHERE nome LIKE 'J%';
SELECT * FROM th_pessoa ORDER BY cod_pessoa ASC;


-- UPDATE th_pessoa SET nome= 'Jose da Silva'
-- WHERE cod_pessoa =1;

-- DELETE from th_pessoa WHERE cod_pessoa =2; 