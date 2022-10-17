DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS car;
DROP TABLE IF EXISTS manufacturer;

CREATE TABLE manufacturer (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

CREATE TABLE car (
  id INT AUTO_INCREMENT PRIMARY KEY,
  model VARCHAR(250) NOT NULL,
  license_plate VARCHAR(250) NOT NULL,
  manufacturer_id INT NOT NULL,
  constraint fk_car_manufacturer
     foreign key (manufacturer_id)
     REFERENCES manufacturer (id)
);

CREATE TABLE customer (
  id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age INT NOT NULL,
  car_id INT,
  constraint fk_customer_ccar
     foreign key (car_id)
     REFERENCES car (id)
);

INSERT INTO manufacturer (id, name) VALUES
(1, 'Audi'),
(2, 'BMW'),
(3, 'Fiat'),
(4, 'Peugeot'),
(5, 'Ford'),
(6, 'VW'),
(7, 'Mitsubishi'),
(8, 'Mercedes'),
(9, 'Jeep');

INSERT INTO car (model, license_plate, manufacturer_id) VALUES
('X6', 'MMM-7788', 2),
('Coupe', 'NNN-8899', 8),
('X3', 'NMN-3322', 2),
('Chronos', 'XXP-1212', 3),
('Polo', 'CPC-0012', 6),
('Renegade', 'EQE-8879', 9),
('Argo', 'DED-5566', 3),
('GLE SUV', 'PQC-5566', 8),
('Argo', 'PAD-2525', 3),
('Pulse', 'ERE-5464', 3),
('Focus', 'SAS-8520', 5),
('Outlander', 'YEY-7894', 7),
('A5', 'LKJ-6543', 1),
('Ranger', 'ASD-1234', 5),
('308', 'FGH-654', 4);


INSERT INTO customer (first_name, last_name, age, car_id) VALUES
('Filipe', 'Silva', 35, 1),
('Maria', 'José', 24, 2),
('João', 'Gomes', 25, 3),
('Lucas', 'Oliveira', 23, 4),
('Julio', 'Correa', 35, 5),
('Julio', 'Lemos', 29, 6),
('Jefferson', 'Reis', 30, 7),
('Marcela', 'Zulim', 30, 8),
('Leonardo', 'Viana', 38, 9),
('Camila', 'Moura', 29, 10),
('Jacqueline', 'Nascimento', 27, 11),
('Juliene', 'Santos', 28, 12),
('Luis', 'Barbosa', 26, 13),
('Amanda', 'Santos', 22, 14),
('Julia', 'Tomé', 21, 15),
('Gloria', 'Borba', 30, 5),
('Caio', 'Cavalcanti', 25, 7),
('Lucas', 'Sales', 25, 8),
('Matheus', 'Gomes', 30, null),
('Thulyo', 'Araujo', 26, null);
