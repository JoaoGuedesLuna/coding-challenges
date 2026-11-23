-- Platform: HackerRank
-- Challenge: Revising the Select Query II
-- Problem: https://www.hackerrank.com/challenges/revising-the-select-query-2/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT c.name FROM city c WHERE c.countrycode = 'USA' AND c.population > 120000;
