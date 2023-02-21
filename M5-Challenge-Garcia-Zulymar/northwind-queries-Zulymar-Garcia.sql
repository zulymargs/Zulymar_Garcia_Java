/*------------------------------------------------------
 	 		Module #5 Challenge: SQL
  Creation of SQL queries to answer various questions. 
  These will be running against the Northwind database
  
  Author: Zulymar García Sonera
------------------------------------------------------*/



-- What are the categories of products in the database?
use northwind;
select products.category
from products;

-- What products are made by Dell?
use northwind;
SELECT *
from products
WHERE product_name
like 'Dell%';

-- List all the orders shipped to Pennsylvania.
use northwind;
SELECT *
from orders
WHERE ship_state='Pennsylvania';

-- List the first name and last name of all employees with last names that start with the letter W.
use northwind;
SELECT first_name, last_name
from employees
where last_name
like 'W%';


-- List all customers from zip codes that start with 55.
use northwind;
select *
from customers
where postal_code
like '55%';

-- List all customers from zip codes that end with 0.
use northwind;
select *
from customers
where postal_code
like '%0';

-- List the first name, last name, and email for all customers with a ".org" email address.
use northwind;
select first_name,last_name,email
from customers
where email
like '%.org';


-- List the first name, last name, and phone number for all customers from the 202 area code.
use northwind;
select first_name,last_name,phone
from customers
where phone
like '1-(202)%';

-- List the first name, last name, and phone number for all customers from the 202 area code, ordered by last name, first name.
use northwind;
select last_name,first_name,phone
from customers
where phone
like '1-(202)%'
order by last_name asc, first_name asc;