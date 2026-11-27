-- Platform: HackerRank
-- Challenge: Draw The Triangle 1
-- Problem: https://www.hackerrank.com/challenges/draw-the-triangle-1/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

WITH RECURSIVE numbers AS (
    SELECT 20 as n
    UNION ALL
    SELECT n - 1 FROM numbers WHERE n > 1
)

SELECT REPEAT('* ', n) FROM numbers;
