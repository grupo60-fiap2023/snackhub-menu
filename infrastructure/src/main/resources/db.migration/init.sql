CREATE TABLE items_menu (
	id INT AUTO_INCREMENT,
	name varchar(255) not null,
	price decimal(19,2) not null,
	category varchar(255) not null,
	primary key (id)
);

CREATE TABLE ingredients (
  id INT AUTO_INCREMENT,
  item_menu_id INT,
  name varchar(255) not null,
  quantity decimal(19,2) not null,
  FOREIGN KEY (item_menu_id) REFERENCES item_menu(id),
  primary key (id)
);

-- Exemplos de dados para a tabela item_menu
INSERT INTO items_menu (name, price, category) VALUES
  ('X-Burger', 10.99, 'Lanche'),
  ('Cheeseburger', 12.49, 'Lanche'),
  ('Chicken Sandwich', 11.99, 'Lanche'),
  ('Fries', 5.99, 'Acompanhamento'),
  ('Soft Drink', 2.99, 'Bebidas');

-- Exemplos de dados para a tabela ingredients
INSERT INTO ingredients (item_menu_id, name, quantity) VALUES
  (1, 'Beef Patty', 1),
  (1, 'Cheese Slice', 1),
  (2, 'Beef Patty', 1),
  (2, 'Cheese Slice', 1),
  (3, 'Chicken Breast', 1),
  (3, 'Lettuce', 0.5),
  (3, 'Tomato', 0.5),
  (3, 'Mayonnaise', 0.2),
  (4, 'Potatoes', 1),
  (5, 'Soda', 1);