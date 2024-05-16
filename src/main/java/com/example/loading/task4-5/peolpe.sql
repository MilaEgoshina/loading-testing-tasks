CREATE TABLE Table (
    Name VARCHAR(50),
    Height INT,
    Born INT
);

INSERT INTO Table (Name, Height, Born) VALUES ('Кирилл', 176, 1995);
INSERT INTO Table (Name, Height, Born) VALUES ('Сергей', 168, 1992);
INSERT INTO Table (Name, Height, Born) VALUES ('Ибрагим', 195, 1997);
INSERT INTO Table (Name, Height, Born) VALUES ('Кирилл', 172, 2001);
INSERT INTO Table (Name, Height, Born) VALUES ('Иннокентий', 183, 2000);
INSERT INTO Table (Name, Height, Born) VALUES ('Кирилл', 181, 1990);

--- Написать SQL запрос, который выводит имя и рост всех Ибрагимов выше 170см, рождённых после 1998 года.

SELECT Name, Height
FROM Table
WHERE Name = 'Ибрагим' AND Height > 170 AND Born > 1998
LIMIT 10;

--- Написать SQL запрос для вставки строки со следующими данными: Имя – Ибрагим, Рост – 179, Год рождения – 1998.

INSERT INTO Table (Name, Height, Born)
VALUES ('Ибрагим', 179, 1998);

--- Написать SQL запрос, который выводит средний рост для каждого из имён. Итоговая выгрузка должна быть отсортирована по имени

SELECT Name, AVG(Height) AS Average_Height
FROM Table
GROUP BY Name
ORDER BY Name;

