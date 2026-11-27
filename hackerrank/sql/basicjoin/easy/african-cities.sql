-- Platform: HackerRank
-- Challenge: African Cities
-- Problem: https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    ci.name
FROM city ci
INNER JOIN country co
ON ci.countrycode = co.code
WHERE co.continent = 'Africa';
