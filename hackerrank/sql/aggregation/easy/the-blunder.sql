-- Platform: HackerRank
-- Challenge: The Blunder
-- Problem: https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT CEIL(AVG(e.salary) - AVG(REPLACE(e.salary, '0', ''))) FROM employees e;