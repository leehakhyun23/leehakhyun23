-- 07_DML_UPDATE

 -- 데이터변경 수정(UPDATE)
 -- UPDATE 테이블명 SET 변경내용 WHERE 검색조건
UPDATE memberlist set age =30, phone = '010-0000-1111' where membernum= 3;

-- 명령문에 WHERE 이후 구문은 생략이 가능하다
-- 다만 이부분을 생략하면 모든 레코드를 대상으로해서 UPDATE 명령이 실행되어 모든 레코드가 수정된다.
-- 검색조건 : 필드명 ( 비교 - 관계연산자) 조건값으로 이루어진 조건연산이며, 흔히 자바에서 IF()
-- IF 괄호안에 사용했던 연산을 그대로 사용하는데 보통이다.
-- 나이가 29세 이상 => WHERE AGE>=29
-- 두개 이상의 필드를 수정하고자 한다면 , 로 구분해서 기술한다
-- 복합 조건을 사용하고자 한다면 AND OR 등을 사용한다(&& => AND , || => OR, !-> NOT)
SELECT * FROM BOOKLIST;
SELECT * FROM MEMBERLIST;
SELECT * FROM RENTLIST;
  
UPDATE BOOKLIST SET GRADE = 18 WHERE TITLE = '봉제인형 살인사건'; 
UPDATE BOOKLIST SET RENTPRICE = RENTPRICE * 1.1; 
UPDATE MEMBERLIST SET BPOINT= BPOINT + 30 WHERE BPOINT > 300; 
UPDATE MEMBERLIST SET AGE = 23 WHERE BIRTH = '2000-01-01';
UPDATE MEMBERLIST SET GENDER = 'M' WHERE GENDER IS NULL;

UPDATE BOOKLIST SET BOOKNUM = 27 WHERE BOOKNUM =17;
-- RENTLIST에 BNUM 에 7번이 없다면 변경이 가능 
-- RENTLIST에 BNUM 에 7번이 있으면 변경이 불가능
-- ORA-02292 : INTEGRITY CONSTAINT (SCOTT.FK1) VIOLATE -CHILDRECORD FOUND

-- 해결방법 1. 외래키를 지우고 해당 BOOKNUM과 BNUM을 함께 수정한 후 다시 외래키를 설정
-- 해결방법 2. PL/SQL의 트리거 기능을 이용해서 동시에 변경

-- 레코드의 삭제
-- DELETE FROM 테이블 WHER 조건식
-- WHERE 조건식이 생략되면 모든 레코드가 삭제
-- RENLIST 테이블에서 DISCOUNT가 10이하인 레코드를 삭제
DELETE FROM RENTLIST WHERE BNUM = 7;
DELETE FROM BOOKLIST WHERE BOOKNUM =7; 

-- 해결방법 2 
-- 외래키 제약조건을 삭제한 후 다시 생성
-- 외래키 생성시에 옵션을 추가해서
-- 참조되는값이 삭제되면 참조하는 값 도 같이 삭제 되게 구성한다
-- 외래키 삭제
ALTER TABLE RENTLIST DROP CONSTRAINT fk1;
-- 외래키 추가 
alter table renlist add constraint fk1;
foreign key(bnum) references booklist(booknum) on delete cascade;

--memberlist 테이블에서 회원한명을 삭제하면, rentlist테이블에서도 해당회원이 대여한 기록을 같이 삭제하도록
-- 외래키 설정을 바꿔주세요(외래키 제약조건 삭제후 재생성)

ALTER TABLE RENTLIST DROP CONSTRAINT fk2;
ALTER TABLE RENTLIST ADD CONSTRAINT fk2
FOREIGN KEY(MNUM) REFERENCES MEMBERLIST( MEMBERNUM ) ON DELETE CASCADE; 