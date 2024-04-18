-- 04 DDL_Alter.sql

-- 생성 
create table 테이블이름();
create user scott identified by tiger;

-- 수정
alter table 테이블이름 <수정될 내용>;
alter user 유저이름 identified by 비밀번호;

-- 1. 필드명의 변경
ALTER TABLE 테이블이름 RENAME COLUMN 변경전필드이름 TO 변경후 필드이름;

-- BOOKLIST 테이블의 SUBJECT 필드명을 TITLE로 수정한다.
ALTER TABLE booklist RENAME COLUMN subject TO title;
SELECT * FROM booklist;

-- 반대로 title 필드명을 subject 필드명으로 수정합니다 
-- rentlist 의 outprice 필드의 이름을 rentprince 로 수정하세요
-- memberlist 테이블의 membername 필드를 name으로 변경하세요
-- rentlist 테이블의 rent_date 필드를 rentdate로 변경하세요
-- renlist 의 idx를 numseq로 변경하세요

ALTER TABLE memberlist RENAME COLUMN memberName TO name;
ALTER TABLE booklist RENAME COLUMN outprice TO rentprince;
ALTER TABLE rentlist RENAME COLUMN rent_date TO rentdate;
ALTER TABLE rentlist RENAME COLUMN idx TO numseq;


--2. 필드 자료형의 변경
-- ALTER TABLE 테이블명 MODIFTY 필드명 자료형 [디폴드값이나 제약사항 ]
ALTER TABLE memberlist modify name varchar2(30);

-- booklist 의 booknum 필드를 number(5)로 자료형 변경
ALTER TABLE booklist modify booknum number(5); --수정 실패
-- memberlist 의 membernum 필드를 number(5) 로 자료형 변경
ALTER TABLE memberlist modify membernum number(5); -- 수정 실패
-- rentlist 의 bnum 필드를 number(5) 로 자료형 변경
ALTER TABLE rentlist modify bnum number(5); -- 수정 실패
-- rentlist 의 mnum 필드를 number(5) 로 자료형 변경
ALTER TABLE rentlist modify mnum number(5); -- 수정 실패 

-- 외래키로 연결되어서 참조되고, 참조하고 있는 필드들은 위의 명령으로 수정이 바로 불가능하다
-- 가능하게 하려면 외래키 제약조건을 수정하여 없애버리고, 참조되는 필드와 참호나느 필드를
-- 모두 수정한 후 외래키 제약 조건을 다시 설정한다.
-- alter 명령에 의해서 제약조건을 수정 또는 삭제하는 명령을 아래서 학습합니다.

--3. 필드의 추가
-- ALTER TABLE 테이블명 ADD 필드명 자료형
--
-- booklist에 구매등급을 저장할 수 있는 grade 필드를 varchar2(15)로 추가
ALTER TABLE booklist add grade varchar2(15);
-- memberlist에 성별(gender)필드를 varchar2(3) 으로 추가
ALTER TABLE memberlist add gender varchar2(3);
-- memberlist에 나이(age) 필드를 number(2) 로 추가 
ALTER TABLE memberlist add age number(2);
select * from memberlist;

-- 4. 필드의 삭제
-- ALTER TABLE 테이블명 DROP COLUMN 필드명

-- memberlist 테이블에서 성별 필드 제거
-- alter table memberlist drop column gender;


-- 5. 제약조건의 추가 / 삭제 

-- 필드레벨의 제약조건의 수정은 => modify 명령을 통해서 수정/생성/삭제 할 수 있음
-- memberlist 의 gender 필드에 'M' 또는 "F" 둘중에 하나만 입력되게 제약조건을 설정한다면 
ALTER TABLE memberlist modify gender varchar2(3) CHECK(gender = 'M' or gender = 'F');
ALTER TABLE memberlist modify gender varchar2(3) CHECK(gender IN ('M', 'F') );
-- gender in('F','M') : gender 필드값이 in 함수 안에 있는 값들일 때만 true 를 결과로,

-- 테이블 레벨의 제약조건 생성
-- 추가 : ALTER TABLE 테이블명 ADD CONSTRAINT 제약 조건명 제약식
-- 테이블 LEVEL의 제약 조건은 위의 명령 형식으로 제약조건 이름과 함께 추가한다
-- memberlist 테이블의 나이(age) 필드에 120살이 초과되는 나이는 입력되지 못하게 제약 조건 추가
ALTER TABLE memberlist ADD CONSTRAINT check_age CHECK(age <=120 );

-- 테이블 레벨의 제약조건 삭제 
-- 삭제 : ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명
alter table rentlist drop constraint fk1;
alter table rentlist drop constraint fk2;
alter table rentlist drop constraint rent_pk;


-- rentlist의 기본키를 numseq로 설정
ALTER TABLE rentlist ADD constraint renk_pk primary key(numseq);
-- rentlist의 외래키를 fk1, fk2로 설정
ALTER TABLE rentlist add constraint fk1 foreign key(bnum) references booklist(booknum);
ALTER TABLE rentlist add constraint fk2 foreign key(mnum) references memberlist(membernum);
SELECT * FROM BOOKLIST;
SELECT * FROM rentlist;
SELECT * FROM memberlist;
CREATE TABLE ORDERS1(
	ORDER_ID NUMBER(12,0),
	ORDER_DATE DATE default sysdate,
	ORDER_MODE VARCHAR2(8),
	CUSTOMER_ID NUMBER(6,0),
	ORDER_STATUS NUMBER(2,0),
	ORDER_TOTAL NUMBER(8,2) default 0,
	SALES_REP_ID NUMBER(6,0),
	PROMOTION_ID NUMBER(6,0),
	constraint pk_order primary key(ORDER_ID),
	constraint ck_order_mode check(ORDER_MODE in('direct','online'))
);

-- 테이블 수정 예제 
-- CUSTOMER_ID 를 CUSTOMER_NUMBER 로 수정
-- Promotion_ID를 10000-99999 사이의 값만 저장 가능 

ALTER TABLE ORDERS1 RENAME COLUMN CUSTOMER_ID TO CUSTOMER_NUMBER;
ALTER TABLE ORDERS1 ADD CONSTRAINT PRO_CHECK CHECK( PROMOTION_ID BETWEEN 10000 AND 99999);

-- 테이블의 복사 
CREATE TABLE orders2 as select * from orders1;

-- 테이블의 제거 
drop table orders2 purge;
