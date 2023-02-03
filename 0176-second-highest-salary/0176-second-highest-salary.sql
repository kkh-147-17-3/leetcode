# Write your MySQL query statement below

SELECT 
     max(result2.salary) AS SecondHighestSalary
FROM
    (SELECT 
        result1.salary 
     FROM
        (SELECT 
            salary,
            DENSE_RANK() OVER (ORDER BY salary DESC) AS 'rank'
        FROM
            Employee ) result1
    WHERE result1.rank = 2) result2

