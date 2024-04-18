-- 09_JOIN.sql

select * from emp;
select * from dept;
drop table emp2;
create table emp2 as select ename, deptno from emp where job = 'SALESMAN' ;
select * from emp2;

-- 1. 사원명이 scott 인 사원의 부서명을 알고 싶을때
select deptno from emp where ename = 'SCOTT';
select dname from dept where deptno = 20;
-- 서브쿼리 사용 
select dname from dept where deptno = (select deptno from emp where ename = 'SCOTT');

-- join 
-- 두개이상의 테이블에 나눠져 있는 관련 데이터들을 하나의 테이블로 모아서 조회하고자 할때 사용하는 명령이다.

-- cross join : 두개 이상의 테이블이 조인 
-- * 가장 최악의 결과를 얻는 조인방식
select * from emp2, dept;

--equl join : 조인 대상이 되는 두테이블에서 공통적으로 존재하는 컬럼의 값이 일치하는 행을 연결하여 결과를 생성
select * from emp2 a, dept b where a.deptno = b.deptno;


select * from emp2 a, dept b where a.deptno = b.deptno;
select * from emp a, dept b where a.deptno = b.deptno;

--rentlist의 대여일자, 대여도서번호, 대여회원번호, 할인 금액을 출력하되, 도서의 제목을
-- 도서번호 옆에 출력하세여

select a.RANTDATE, a.BNUM, b.title, a.MNUM, a.DISCOUNT from RENTLIST a, booklist b 
where a.bnum + 20 = b.booknum;

select * from BOOKLIST;
select * from MEMBERLIST;
select * from RENTLIST;
UPDATE RENTLIST SET bnum = bnum +15;

-- RENTLIST의 대여일자 ,대여도서번호, 대여회원번호 , 할인 금액을 출력하되, 도서제목, 회원의 이름을
-- 도서번호와 회원 옆에 출력하세요.
SELECT A.RENTDATE, A.BNUM, A.MNUM, A.DISCOUNT FROM RENTLIST A ,BOOKLIST B
WHERE A.BNUM = B.BOOKNUM;

SELECT A.RENTDATE, A.BNUM , A.MNUM, B.NAME, A.DISCOUNT FROM RENTLIST A, MEMBERLIST B
WHERE A.MNUM = B.MEMBERNUM;

-- RENTLIST의 대여일자 ,대여도서번호, 대여회원번호 , 할인 금액을 출력하되, 도서제목, 회원의 이름을
-- 도서번호와 회원 옆에 출력하세요. 
SELECT a.rentdate, a.bnum , b.title , a.mnum , c.name, a.discount, b.rentprice-a.discount as "매출액"
FROM rentlist a, booklist b, memberlist c
WHERE a.bnum = b.booknum and a.mnum = c.membernum;

-- non-equil join
-- 동일컬럼이 없어서 다른 조건을 사용하여 조인
-- 조인 조건을 특정 범위내에 있는지를 조사하기 위해 조건절에 조인 조건을 '=' 연산자 이외의 비교
select *from emp; 
select *from salgrade; 

select a.ename, a.sal, b.grade
from emp a, salgrade b
where a.sal>= b.losal and a.sal <= b.hisal;

select a.ename, a.sal, b.grade
from emp a, salgrade b
where a.sal between b.losal and b.hisal;

--outer join 
--조인 조건에 만족하지 못해서 해당 결과를 출력시에 누락이 되는 문제점이 발생할 때 레코드를 출력하는 조인
select a.booknum, a.title , b.rentdate
from booklist a, rentlist b
where a.booknum = b.bnum;

select a.booknum, a.title , b.rentdate
from booklist a, rentlist b
where a.booknum = b.bnum(+);

-- emp 테이블에는 deptno가 40인 레코드가 하나도 없다. 그래서 조인된 결과는 40번 부서의 이름도 loc도 표시가 안된다. 
select *
from emp a, dept b
where a.deptno(+) = b.deptno;

-- ANSI join
--일반 equi 조인 
select a.ename , b.dname
from emp a, dept b
where a.deptno = b.deptno;

--ANSI inner join 
-- ANSI 이너 조인의 표현 방식
select ename, dname
from emp inner join dept on emp.deptno = dept.deptno;

--Ansi 이너 조인의 표현 방식 - 서로 비교되는  필드명이 같을 때만 사용
select ename, dname
from emp inner join dept using(deptno);

--Ansi Outer Join 표현 방식
select * from emp right outer join dept on emp.deptno = dept.deptno;
select * from rentlist right outer join booklist on rentlist.bnum = booklist.booknum;

select * from rentlist, booklist
where rentlist.bnum(+) = booklist.booknum;

--Ansi Outer Join 표현방식
select * from emp right outer join dept on emp.deptno = dept.deptno;
select * from rentlist right outer join booklist on rentlist.bnum = booklist.booknum;

