-- 08_DML_SELECT.SQL

-- 오라클 명령어 : select 문 (검색)
-- 가장 사용빈도수가 높은 명령
-- 1. scott 테이블이 관리하고 있는 테이블 목록
select * from tab;
select * from tabs;

-- 2. 특정 테이블의 구조 조회(필드 리스트 / 데이터 형식)
desc booklist; --커맨드창(sqlplus)에서 확인 요망 
desc memberlist;--커맨드창(sqlplus)에서 확인 요망 

-- 3. 테이블의 제약사항 조회
select * from USER_CONSTRAINTS; -- 모든 제약사항 
select * from USER_CONSTRAINTS WHERE TABLE_NAME = 'RENTLIST'; -- 특정 테이블의 제약 사항
select * from USER_CONSTRAINTS WHERE TABLE_NAME = 'BOOKLIST';


-- ㄴSELECT 의 사용법
-- SELECT : select 와 from 사이에 조회하고자 하는 필드명들을 , 로 구분하여 나열합니다
select booknum, subject, rentprice from booklist;
-- 모든 필드를 한번에 지목하려면 * 을 써준다, -- select * from...
-- from 뒹에는 대상 테이블 명을 써준다
-- where 절을 붙혀서 조건에 맞는행만 골라내기도 한다.
select 필드명들 또는 * from 테이블명 where 검색조건
-- 출판년도가 2020년 이후인 도서의 제목과 출판년도를 조회
select subject, makeyear from booklist where makeyear >= 2020;

select * from booklist --검색 조건 없이 모든 필드를 다 조회해서 열람

--연산의 결과가 필드의 항목을 조회될 수 있다.
select rentprice*10 - inprice from booklist;
select rentprice*10 - inprice as 마진 from booklist;
select title as 제목, rentprice * 10 - inprice as 마진 from booklist;
select title as 제목, rentprice * 10 - inprice as "10회대여 마진" from booklist;
select booknum || '-' || title as "book info" from booklist ; 
-- 오라클 SL 에서는 || 는 이어붙이기 연산이다. 

--중복 제거 distinct
select bnum as 대여도서번호들 from rentlist;
select distinct bnum as 대여도서번호들 from rentlist;

-- 함수의 사용 
select avg(inprice) as 입고가격평균 from booklist;

-- 검색 조건 : update 와 delete 에서 하던 where 과 방식이 같음

select * from memberlist where NAME like '김%';

select * from memberlist where birth >= '1983-01-01' ;

select * from booklist where makeyear < 2016 or inprice <18000;

select * from booklist where title like '_것%';
