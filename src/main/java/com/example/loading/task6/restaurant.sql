CREATE TABLE Table1 (
    Title VARCHAR(50),
    Cost INT
);

CREATE TABLE Table2 (
    Title VARCHAR(50),
    Rest VARCHAR(50)
);

INSERT INTO Table1 (Title, Cost) VALUES ('Пицца Пеперони', 1150);
INSERT INTO Table1 (Title, Cost) VALUES ('Мясное рагу', 600);
INSERT INTO Table1 (Title, Cost) VALUES ('Салат Цезарь', 700);
INSERT INTO Table1 (Title, Cost) VALUES ('Пицца 4 сыра', 1048);
INSERT INTO Table1 (Title, Cost) VALUES ('Иты, Брут?', NULL);

INSERT INTO Table2 (Title, Rest) VALUES ('Каширский дворик', 'Пицца Пеперони');
INSERT INTO Table2 (Title, Rest) VALUES ('Айвазовский', 'Салат Цезарь');
INSERT INTO Table2 (Title, Rest) VALUES ('ДелаВур', 'Мясное рагу');
INSERT INTO Table2 (Title, Rest) VALUES ('ПиццаШляпа', 'Пицца 4 сыра');
INSERT INTO Table2 (Title, Rest) VALUES ('Иты, Брут?', 'Салат Цезарь');
INSERT INTO Table2 (Title, Rest) VALUES ('Каширский дворик', 'Пицца 4 сыра');

--- Написать SQL - запрос, который для каждого ресторана выводит его название и стоимость самой дорогой пиццы в этом ресторане

SELECT t2.Rest, MAX(t1.Cost) AS MaxPizzaCost
FROM Table1 t1
JOIN Table2 t2 ON t1.Title = t2.Title
GROUP BY t2.Rest;

