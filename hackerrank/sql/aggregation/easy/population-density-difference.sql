-- Platform: HackerRank
-- Challenge: Population Density Difference
-- Problem: https://www.hackerrank.com/challenges/population-density-difference/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT MAX(c.population) - MIN(population) FROM city c;
