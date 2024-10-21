CREATE TABLE product(
   id SERIAL PRIMARY KEY,
   description VARCHAR(500),
   price NUMERIC(10, 2) NOT NULL
);