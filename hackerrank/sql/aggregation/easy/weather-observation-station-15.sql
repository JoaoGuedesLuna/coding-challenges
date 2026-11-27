-- Platform: HackerRank
-- Challenge: Weather Observation Station 15
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-15/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    CAST(TRUNC(s.long_w, 4) AS DECIMAL(10, 4))
FROM station s
WHERE s.lat_n < 137.2345
ORDER BY s.lat_n DESC
FETCH FIRST 1 ROW ONLY;
