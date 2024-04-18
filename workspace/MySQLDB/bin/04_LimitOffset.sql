-- 04_limitoffset

--select 명령의 결과 레코드가 객수가 많을 때, 일부만 지목해서 열람할 수 있습니다.
-- 오라클에서는 rownum 이라는 키워드를 이용합니다
-- select rownum , 테이블이름.*from 테이블이름; 
-- SELECT * FROM 테이블이름 WHERE ROWNUM>=1 AND ROWNUM <= 10;

-- Limit
-- select로 데이터 조회할 때 조회할 레코드의 갯수를 조절 제한 할 수 있다.
select * from memberlist order by membernum desc limit 5;

-- OFFSET
-- select 로 데이터 조회할 때, 맨 위에서 부터 offset 에 지정한 번째 까지는 뛰어 넘고 그 다음부터 리턴
select * from memberlist order by membernum desc;
select * from memberlist order by membernum desc limit 5 offset 3;
-- 3번째 데이터부터 5개의 레코드 리턴 - 개수가 모자르면 있는 곳 까지 리턴


