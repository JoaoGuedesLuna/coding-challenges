-- Platform: HackerRank
-- Challenge: Employee Salaries
-- Problem: https://www.hackerrank.com/challenges/salary-of-employees/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT e.name FROM employee e WHERE e.salary > 2000 AND e.months < 10 ORDER BY e.employee_id;
