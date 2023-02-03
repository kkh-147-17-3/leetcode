# Write your MySQL query statement below

select max(
        result2.salary
    ) as SecondHighestSalary
from
    (select result1.salary 
     from
        (SELECT 
            salary,
            DENSE_RANK() OVER (ORDER BY salary DESC) AS 'rank'
        FROM
            Employee ) result1
    where result1.rank = 2) result2

