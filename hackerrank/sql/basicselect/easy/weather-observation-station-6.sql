-- Platform: HackerRank
-- Challenge: Weather Observation Station 6
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT DISTINCT s.city FROM station s WHERE LOWER(s.city) LIKE 'a%'
    OR LOWER(s.city) LIKE 'e%'
    OR LOWER(s.city) LIKE 'i%'
    OR LOWER(s.city) LIKE 'o%'
    OR LOWER(s.city) LIKE 'u%';
