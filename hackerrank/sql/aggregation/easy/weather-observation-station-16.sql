-- Platform: HackerRank
-- Challenge: Weather Observation Station 16
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-16/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT CAST(ROUND(MIN(s.lat_n), 4) AS DECIMAL(10, 4)) FROM station s WHERE s.lat_n > 38.7780;
