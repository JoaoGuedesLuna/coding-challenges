-- Platform: HackerRank
-- Challenge: Draw The Triangle 2
-- Problem: https://www.hackerrank.com/challenges/draw-the-triangle-2/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

WITH RECURSIVE numbers AS (
    SELECT 1 as n
    UNION ALL
    SELECT n + 1 FROM numbers WHERE n < 20
)

SELECT REPEAT('* ', n) FROM numbers;
