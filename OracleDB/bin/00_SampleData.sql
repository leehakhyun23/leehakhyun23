DROP TABLE DEPT;

CREATE TABLE DEPT (

DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY, 

DNAME VARCHAR2(14) ,

LOC VARCHAR2(13) 

) ;

​

DROP TABLE EMP;

CREATE TABLE EMP  (

EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,

ENAME VARCHAR2(10),

JOB VARCHAR2(9),

MGR NUMBER(4),

HIREDATE DATE,

SAL NUMBER(7,2),

COMM NUMBER(7,2),

DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT

);

​

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');

INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');

INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');

INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,to_date('17-12-1980','dd-mm-yyyy'),800,NULL,20);

INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,to_date('20-2-1981','dd-mm-yyyy'),1600,300,30);

​

INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,to_date('22-2-1981','dd-mm-yyyy'),1250,500,30);

INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,to_date('2-4-1981','dd-mm-yyyy'),2975,NULL,20);

INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,to_date('28-9-1981','dd-mm-yyyy'),1250,1400,30);

INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,to_date('1-5-1981','dd-mm-yyyy'),2850,NULL,30);

INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,to_date('9-6-1981','dd-mm-yyyy'),2450,NULL,10);

INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,to_date('13-7-1987','dd-mm-yyyy'),3000,NULL,20);

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,to_date('17-11-1981','dd-mm-yyyy'),5000,NULL,10);

INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,to_date('8-9-1981','dd-mm-yyyy'),1500,0,30);

INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,to_date('13-7-1987','dd-mm-yyyy'),1100,NULL,20);

INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,to_date('3-12-1981','dd-mm-yyyy'),950,NULL,30);

INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,to_date('3-12-1981','dd-mm-yyyy'),3000,NULL,20);

INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,to_date('23-1-1982','dd-mm-yyyy'),1300,NULL,10);

​

DROP TABLE BONUS;

CREATE TABLE BONUS (

 ENAME VARCHAR2(10) ,

 JOB VARCHAR2(9)  ,

 SAL NUMBER,

 COMM NUMBER

 ) ;

​

DROP TABLE SALGRADE;

CREATE TABLE SALGRADE( 

GRADE NUMBER, 

LOSAL NUMBER, 

HISAL NUMBER 

);

INSERT INTO SALGRADE VALUES (1,700,1200);

INSERT INTO SALGRADE VALUES (2,1201,1400);

INSERT INTO SALGRADE VALUES (3,1401,2000);

INSERT INTO SALGRADE VALUES (4,2001,3000);

INSERT INTO SALGRADE VALUES (5,3001,9999);

select * from emp;
select * from dept;

-- IN ANY SOME ALL

-- 부서번호가 10,20,30 인 사원들의 모든 필드 조회
-- 방법1 
select * from emp where deptno= 10 or deptno=20 or deptno=30;
-- 방법2 
select * from emp where deptno <> 40;
-- 방법3 
select * from emp where deptno in(10,20,30);

-- 1.ANY 
select * from emp where deptno = any(10,20,40);
-- ANY() : 괄호안에 나열된 내용중 어느하나라도 해당하는 것이 있다면 검색 대상으로 함
-- in 과 유사

--2. SOME 조건식 - ANY와 동일
SELECT * FROM emp WHERE deptno = some(10,20,40);

-- ALL
select * from emp where deptno = all(10,20,40);
-- 괄호안의 모든 값이 동시 만족해야하는 조건이므로 해당하는 레코드가 없을때가 대부분이다. 사용빈도가 낮음

select * from emp where deptno <> all(10,20,40);
-- 이외 같이 구성내용과 모두 같지 않을때를 필터링할 때 자주 사용 
-- 위 예문을 in으로 표현
select * from emp where deptno not in(10,20,40);

-- 그 외 활용하기 좋은 select 에 대한 예제

-- 부서번호가 10이 아닌 사원(아래 두 문장은 같은 의미의 명령이다.)
select * from emp where not (deptno=10);
select * from emp where deptno <>10;

-- 급여가 1000달러 이상, 3000달러 이하
select * from emp where sal> 1000 and sal <3000;
select * from emp where sal between 1000 and 3000;

-- 사원의 연봉 출력
select deptno, ename , sal*12 as 연봉 from emp;

-- 정렬(sort) - where 구문 뒤에, 또는 구문의 맨끝에 order by 필드명 [desc]
-- select 명령의 결과를 특정 필드값의 오름차순이나 내림차순으로 정렬하라는 명령
-- asc : 오름차순 정렬, 쓰지 않으면 기본으로 오름차순
-- desc : 내림차순 정렬, 내림 차순 정렬을 위해서느 반드시 필드명 뒤에 써야하는 키워드이다.

-- emp 테이블에서
-- sal이 1000이상인 데이터를 ename 의 오름차순으로 정렬하여 조회
select * from emp where sal >= 1000 order by ename; -- 오름차순일대 asc 는 생략가능
-- sal 이 1000이상인 데이터를 ename 의 내림차순으로 정렬하여 조회
select * from emp where sal >= 1000 order by ename desc;


-- job 으로 내림차순 정렬후 같은 job_id 사이에서는 순서를 hireate 의 내림차순으로 정렬
select * from emp order by job desc, hiredate desc; 
-- 두개 이상의 정렬 기준이 필요하다면 위와 같이 콤마, 로 구분해서 두가지 기준을 지정해주며,
-- 위의 예제로 봤을때 job 으로 1차 내림차순 정렬을 하고 같은 job 값들 사이에 hiredate로 내림차순 정렬한다.

