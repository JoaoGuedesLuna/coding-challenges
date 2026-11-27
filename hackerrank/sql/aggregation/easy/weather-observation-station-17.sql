-- Platform: HackerRank
-- Challenge: Weather Observation Station 17
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-17/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    CAST(ROUND(s.long_w, 4) AS DECIMAL(10, 4))
FROM station s
WHERE s.lat_n > 38.7780
ORDER BY s.lat_n
FETCH FIRST 1 ROW ONLY ;
