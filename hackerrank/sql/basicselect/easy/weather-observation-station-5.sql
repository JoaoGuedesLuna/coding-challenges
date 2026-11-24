-- Platform: HackerRank
-- Challenge: Weather Observation Station 5
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-5/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

-- SELECT s.city, LENGTH(s.city) FROM station s ORDER BY LENGTH(s.city) ASC, s.city ASC LIMIT 1;
-- SELECT s.city, LENGTH(s.city) FROM station s ORDER BY LENGTH(s.city) DESC, s.city ASC LIMIT 1;

WITH ranked_cities AS (
    SELECT
        s.city,
        LENGTH(s.city) AS name_length,
        ROW_NUMBER() OVER (ORDER BY LENGTH(CITY) ASC, CITY ASC) AS shortest_rank,
        ROW_NUMBER() OVER (ORDER BY LENGTH(CITY) DESC, CITY ASC) AS longest_rank
    FROM station s
)

SELECT rc.city, rc.name_length FROM ranked_cities rc WHERE shortest_rank = 1 OR longest_rank = 1;
