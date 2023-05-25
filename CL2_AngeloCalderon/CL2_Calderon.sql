SET GLOBAL time_zone = '+8:00';
-- borra la bd si existe
DROP DATABASE IF EXISTS CL2_Calderon;
-- creamos la bd
CREATE DATABASE CL2_Calderon;
-- activamos la bd
USE CL2_Calderon;

CREATE TABLE Area (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    jefe_area VARCHAR(255) NOT NULL
);

  CREATE TABLE Personal (
    id INT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    codigo_trabajador VARCHAR(255) NOT NULL,
    sueldo DOUBLE NOT NULL,
    codigo_area INT,
    FOREIGN KEY (codigo_area) REFERENCES Area(codigo)
);
   
INSERT INTO Area (codigo, nombre, jefe_area) VALUES
    (1, 'CONTABILIDAD', 'Pedro Pascal'),
    (2, 'VENTAS', 'Ivan Rakitich'),
    (3, 'MARKETING', 'Bernardo Cuesta');

INSERT INTO Personal (id, nombre, codigo_trabajador, sueldo, codigo_area) VALUES
    (1, 'Lionel Messi', 'COD1', 2000.00, 1),
    (2, 'Kevin De Bryune', 'COD2', 1800.00, 1),
    (3, 'Jack Nicholson', 'COD3', 2200.00, 2),
    (4, 'Leonardo Di Caprio', 'COD4', 1900.00, 2),
    (5, 'Oleksandr Ivankov', 'COD5', 2100.00, 2),
    (6, 'Freddy Sinna', 'COD6', 2400.00, 3),
    (7, 'Luis Iberico', 'COD7', 2300.00, 3),
    (8, 'Ricardo Centeno', 'COD8', 2500.00, 3);
    
  

    