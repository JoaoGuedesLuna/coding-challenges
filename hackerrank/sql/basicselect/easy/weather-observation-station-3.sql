-- Platform: HackerRank
-- Challenge: Weather Observation Station 3
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-3/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT DISTINCT s.city FROM station s WHERE MOD(s.id, 2) = 0;
