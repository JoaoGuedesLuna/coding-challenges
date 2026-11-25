-- Platform: HackerRank
-- Challenge: Japan Population
-- Problem: https://www.hackerrank.com/challenges/japan-population/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT SUM(c.population) FROM city c WHERE c.countrycode = 'JPN';
