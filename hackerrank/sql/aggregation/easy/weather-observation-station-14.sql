-- Platform: HackerRank
-- Challenge: Weather Observation Station 14
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-14/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT CAST(TRUNC(MAX(s.lat_n), 4) AS DECIMAL(10, 4)) FROM station s WHERE s.lat_n < 137.2345;
