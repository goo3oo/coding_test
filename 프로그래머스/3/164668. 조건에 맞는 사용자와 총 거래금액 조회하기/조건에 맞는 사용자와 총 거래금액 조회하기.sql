SELECT u.USER_ID, u.NICKNAME, SUM(b.PRICE)
FROM USED_GOODS_BOARD b inner join USED_GOODS_USER u on b.WRITER_ID = u.USER_ID
WHERE b.STATUS = 'DONE'
GROUP BY USER_ID
HAVING SUM(b.PRICE) >= 700000
ORDER BY SUM(b.PRICE)