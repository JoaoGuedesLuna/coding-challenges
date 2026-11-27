-- Platform: HackerRank
-- Challenge: Average Population of Each Continent
-- Problem: https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    co.continent, FLOOR(AVG(ci.population))
FROM city ci
INNER JOIN country co
ON ci.countrycode = co.code
GROUP BY co.continent;
