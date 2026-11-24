-- Platform: HackerRank
-- Challenge: Weather Observation Station 4
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-4/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT COUNT(*) - COUNT(DISTINCT s.city) FROM station s;
