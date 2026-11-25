-- Platform: HackerRank
-- Challenge: Top Earners
-- Problem: https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true
-- Author: João Guedes (https://github.com/JoaoGuedesLuna)

SELECT
    e.months * e.salary AS total_earnings,
    COUNT(*) AS employee_count
FROM employee e
GROUP BY e.months * e.salary
ORDER BY total_earnings DESC
FETCH FIRST 1 ROW ONLY;
