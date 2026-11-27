-- Platform: HackerRank
-- Challenge: Weather Observation Station 2
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-2/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    CAST(ROUND(SUM(s.lat_n), 2) AS DECIMAL(10, 2)),
    CAST(ROUND(SUM(s.long_w), 2) AS DECIMAL(10, 2))
FROM station s;
