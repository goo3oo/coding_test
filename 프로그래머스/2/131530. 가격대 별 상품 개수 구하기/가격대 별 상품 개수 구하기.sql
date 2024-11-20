SELECT case WHEN price >= 80000 then 80000
            WHEN price >= 70000 then 70000
            WHEN price >= 60000 then 60000
            WHEN price >= 50000 then 50000
            WHEN price >= 40000 then 40000
            WHEN price >= 30000 then 30000
            WHEN price >= 20000 then 20000
            WHEN price >= 10000 then 10000
            WHEN price >= 0     then 0
            END PRICE_GROUP,
            COUNT(1) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP