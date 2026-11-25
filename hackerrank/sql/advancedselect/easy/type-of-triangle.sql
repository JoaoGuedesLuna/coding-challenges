-- Platform: HackerRank
-- Challenge: Type of Triangle
-- Problem: https://www.hackerrank.com/challenges/what-type-of-triangle/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    CASE
        WHEN t.a + t.b <= t.c OR t.a + t.c <= t.b OR t.b + t.c <= t.a
            THEN 'Not A Triangle'

        WHEN t.a = t.b AND t.b = t.c
            THEN 'Equilateral'

        WHEN t.a = t.b OR t.a = t.c OR t.b = t.c
            THEN 'Isosceles'

        ELSE 'Scalene'
    END AS triangle_type
FROM triangles t;
