SELECT MCDP_CD as '진료과코드', count(1) as '5월예약건수'
FROM APPOINTMENT 
WHERE date_format(APNT_YMD, '%m')=05
GROUP BY MCDP_CD
ORDER BY count(1), MCDP_CD

