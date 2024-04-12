-- 06_DML.sql

-- DML (Data Managemnet Language) 데이터 조작언어
-- 테이블에 레코드를 조작(추가, 수정, 삭제, 조회) 하기 위한 명령어들
-- INSERT(추가)
-- UPDATE(수정)
-- DELETE(삭제)
-- SELECT(조회 및 선택)

-- 1. 샘플 테이블 생성
CREATE TABLE exam01(
	deptno number(2),
	dnaame varchar2(15),
	loc varchar2(15)
);
select * from exam01;

-- 2. 레코드 추가 
-- 방법 1
insert into 테이블이름 ( 필드명 1, 필드명 2, 필드명 3, ...) values(값1,값2, 값3, ...);

-- 방법 2 
insert into 테이블이름 values(값1, 값2, 값3, ...);

-- 방법 1,2 의 차이점
-- 방법 1. 필드명과 입력되어야하느 값들이 1:1 매칭되어 입력된다.
--		  필드명의 순서는 반드시 지켜야하는 것은 아니지만 나열된 필드명대로 값들의 순서를 맞춰서 입력한다
insert into exam01(deptno, dname, loc) values('기획부', 10, '서울'); x
insert into exam01(deptno, dname, loc) values( 10,'기획부', '서울'); o
insert into exam01(loc, deptno, dname) values('서울', 10,'기획부' ); o
-- 	null 값을 허용하는 필드나, default 값이 있는 필드는 생략하고 구성할 수 있다.
insert into exam01(deptno, dname )values(10, '기획부');  o

-- 방법 2. 모든 필드에 해당하는 값들을 최초에 테이블 생성 시에 기술한 필드순서에 맞게 모두 입력해야 하는 방법이다.
insert into exam01 values(10, '기획부', '서울') o
insert into exam01 values( 10, null , '서울') o

-- 1과 2 공통으로 숫자는 그냥 쓰고 , 문자는 작은 따옴표로 묶어서 표현 

delete from booklist; -- 테이블내의 모든 레코드를 삭제하는 명령
select * from booklist;

insert into booklist values(book_seq.nextVal, '일곱해의 마지막', 2020, 12150 , 2000, 'all');
insert into booklist values(book_seq.nextVal, '봉제인형 살인사건', 2019, 13150 , 2000, '18');
insert into booklist values(book_seq.nextVal, '쇼코의 미소', 2023, 13420 , 2000, '12');
insert into booklist values(book_seq.nextVal, '개미', 1993, 14250 , 2000, 'all');
insert into booklist values(book_seq.nextVal, '나무', 2002, 14150 , 2000, 'all');
insert into booklist values(book_seq.nextVal, '오라클데이터베이스', 2020, 30000 , 2000, 'all');
insert into booklist values(book_seq.nextVal, '가면산장 살인사건', 2018, 13320 , 1500, '12');
insert into booklist values(book_seq.nextVal, '이것이 자바다', 2017, 30150 , 2000, '18');
insert into booklist values(book_seq.nextVal, '홍길동전', 1400, 300000 , 9000, 'all');
insert into booklist values(book_seq.nextVal, '좀비아이', 2020, 12000 , 2500, 'all');
-- meberlist 10명 데이터 추가해주세요 (member_seq 이용)
select * from memberlist;
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '박찬호', '010-0000-1111');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '김도영', '010-2222-2222');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '김선빈', '010-3333-3331');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '나성범', '010-4411-4441');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '최형우', '010-1441-1555');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '소크라테스', '010-1771-7711');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '서건창', '010-1111-8888');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '이우성', '010-9999-1111');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '김태군', '010-1001-1100');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '최원준', '010-5451-1541');
insert into memberlist(membernum , name, phone) values(member_seq.nextVal, '양현종', '010-1767-7611');

select * from rentlist;

insert into rentlist values(rent_seq.nextVal , '2021/10/01', 7 , 4, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/05', 9 , 2, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/02', 1 , 1, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/21', 3 , 3, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/11', 1 , 5, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/11', 1 , 5, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/16', 2 , 7, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/06', 7 , 9, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/12', 2 , 8, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/16', 4 , 7, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/18', 4 , 6, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/09', 5 , 6, 100);
insert into rentlist values(rent_seq.nextVal , '2021/10/07', 5 , 9, 100);

commit -- 현재창에서 commit 은 세미콜론을 안붙히고 단일명령이고 다른 명령과 함께 사용하지 않는다.
--데이터베이스 백업명령
exp userid=scott/tiger file=abc.dmp log=abc.log
-- 데이터 베이스 복원명령
imp userid=scott/tiger file=abc.dmp log=abc.log full=y





