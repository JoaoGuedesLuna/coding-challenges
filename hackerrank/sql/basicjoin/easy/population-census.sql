-- Platform: HackerRank
-- Challenge: Population Census
-- Problem: https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    SUM(ci.population)
FROM city ci
INNER JOIN country co
ON ci.countrycode = co.code
WHERE co.continent = 'Asia';
