-- 12_GroupFunction.sql

-- 테이블내에 하나의 필드값들 전체로 하는 함수 

-- 합계 SUM()
SELECT sum(inprice) as "입고가격합계" from booklist;
select sum(rentprice) as "대여가격합계" from booklist WHERE inprice>= 18000;

-- 갯수 COUNT()
SELECT COUNT(*) AS  "회원수 " FROM MEMBERLIST;
SELECT COUNT(*) AS  "회원수 " FROM MEMBERLIST WHERE NAME LIKE ('김%');

-- 평군 AVG()
SELECT ROUND(AVG(INPRICE),0) AS "입고가격평균" FROM BOOKLIST;
-- TO_CHAR 로 변경된 숫자는 문자로 변경된 것이므로 이제 숫자로서의 기능이 살실된다. 다른 숫자와 계산불가
SELECT TO_CHAR(AVG(INPRICE), '999,999,999') AS "입고가격평균 " FROM BOOKLIST;

-- MAX : 최대값
-- SEQUENCE 에 의해서 방금 추가된 자동 증가번호를 조회할때 많이 사용한다.
SELECT MAX(INPIRCE) FROM BOOKLIST;
-- MIN : 최소값
SELECT MIN(INPRICE) FROM BOOKLIST;


-- GROUP BY
-- 그릅함수의 결과들을 다른 필드의 그룹으로 재구성
SELECT COUNT(*) FROM RENTLIST;

--도서별 대여건수
select bnum as "도서번호" , count(*) as "도서별 대여건수",sum(discount) as "할인금액합계" from rentlist group by bnum;

-- rentlist 테이브에서 대여일자별 대여건수와 할인금액 평균
select rentdate as 대여일자, count(*) as 대여건수
from rentlist group by rentdate order by rentdate desc;

select * from rentlist;
-- having
-- r그룹핑된 내용들에 조건을 붙일때
select rentdate as 대여일자, count(*) as "대여건수", avg(discount) as "할인금액 평균"
from rentlist
group by rentdate
having avg(discount)>= 100
order by rentdate desc;