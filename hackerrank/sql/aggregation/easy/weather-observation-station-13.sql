-- Platform: HackerRank
-- Challenge: Weather Observation Station 13
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-13/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT CAST(TRUNC(SUM(s.lat_n), 4) AS DECIMAL(10, 4)) FROM station s WHERE s.lat_n > 38.7880 AND s.lat_n < 137.2345;
