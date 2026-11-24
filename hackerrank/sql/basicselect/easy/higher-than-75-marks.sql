-- Platform: HackerRank
-- Challenge: Higher Than 75 Marks
-- Problem: https://www.hackerrank.com/challenges/more-than-75-marks/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT s.name FROM students s WHERE s.marks > 75 ORDER BY RIGHT(s.name, 3), s.id;
