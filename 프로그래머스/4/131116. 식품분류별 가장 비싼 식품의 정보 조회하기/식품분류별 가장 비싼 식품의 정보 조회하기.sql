    SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
    FROM(
        SELECT 
            CATEGORY, 
            PRICE,  
            PRODUCT_NAME,
            RANK() OVER(PARTITION BY CATEGORY ORDER BY PRICE DESC) AS rnk
        FROM FOOD_PRODUCT 
        WHERE CATEGORY IN ('과자', '국', '김치','식용유')
    )a
    WHERE rnk = 1
    ORDER BY PRICE DESC