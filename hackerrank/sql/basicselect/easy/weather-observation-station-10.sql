-- Platform: HackerRank
-- Challenge: Weather Observation Station 10
-- Problem: https://www.hackerrank.com/challenges/weather-observation-station-10/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT DISTINCT s.city FROM station s WHERE LOWER(s.city) NOT LIKE '%a'
    AND LOWER(s.city) NOT LIKE '%e'
    AND LOWER(s.city) NOT LIKE '%i'
    AND LOWER(s.city) NOT LIKE '%o'
    AND LOWER(s.city) NOT LIKE '%u';
