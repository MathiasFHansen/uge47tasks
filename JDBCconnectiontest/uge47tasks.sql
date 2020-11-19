USE SAKILA;
#task1
SELECT * FROM ACTOR;
SELECT * FROM ACTOR WHERE last_name = "CAGE";
SELECT * FROM ACTOR WHERE first_name <> "ZERO" and first_name <> "NICK";
SELECT * FROM ACTOR WHERE first_name in ("NICK", "JOHNNY", "JAMES", "MORGAN", "WHOOPI"); 
SELECT * FROM ACTOR WHERE actor_id Between 50 and 150;
SELECT * FROM ACTOR WHERE first_name LIKE "a%";
SELECT * FROM ACTOR ORDER BY first_name asc;
SELECT * FROM ACTOR ORDER BY last_name desc;
SELECT COUNT(*) FROM ACTOR;
SELECT COUNT(DISTINCT first_name) FROM ACTOR;

SELECT category_id FROM category WHERE name = "horror";
SELECT film_id FROM film_category where category_id = (SELECT category_id FROM category WHERE name = "horror");
SELECT * FROM film where film_id in (SELECT film_id FROM film_category where category_id = (SELECT category_id FROM category WHERE name = "horror"));
SELECT title as name, description FROM film where film_id in (SELECT film_id FROM film_category where category_id = (SELECT category_id FROM category WHERE name = "horror"));


#task2
INSERT INTO actor (first_name, last_name)  VALUES("Mathias", "Filtenborg Hansen");
SELECT * FROM actor;

SELECT * FROM film_actor;
INSERT INTO film_actor (actor_id, film_id) values(201,1), (201,2), (201,3), (201,4), (201,5);
SELECT * FROM film_actor WHERE actor_id = 201;
update actor set first_name = "Oofy", last_name = "DoofyDOO" WHERE actor_id = 201;

set foreign_key_checks = 0;
delete from actor where actor_id = "201";
delete from actor where actor_id = "202";
set foreign_key_checks = 1;


#task3
SELECT * FROM category;
SELECT * FROM category WHERE name = "horror";
SELECT * FROM film join film_category ON film.film_id = film_category.film_id WHERE category_id = "11";


#task4
SELECT * FROM CITY;
SELECT count(*) from city;
SELECT * FROM city WHERE population >= 5000000;