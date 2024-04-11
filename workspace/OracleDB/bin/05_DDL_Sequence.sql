-- 05_DDL_Sequence.sql

-- *오라클 - 시퀀스(Sequence)
-- : 테이블 내의 중복되지 않는 숫자를 자동으로 생성하는 자동 번호 발생기
-- : 테이블 생성 후 시퀀스(일렬번호)를 따로 만들어야 한다.
-- 생성방법
-- create sequence 시퀀스 이름 start with 시작숫자 increment by 증가량 ;

-- 주로 number 형식에 기본키값으로 사용한다
-- 일렬번호정도로 이해하셔도 ㄱㅊ
-- number(자리수) : 자료형의 자리수가 몇자리냐에 따라 그만큼 숫자가 증가 가능 


-- 1. 시퀀스의 생성 (테이블별로 시퀀스가 하나씩 있어야함 재활용 불가) 
CREATE SEQUENCE book_seq START WITH 1 INCREMENT BY 1;

-- 테이블에 레코드 추가
insert into booklist values(book_seq.nextVal, '일곱해의 마지막', 2020, 12150 , 2000, 'all');
insert into booklist values(book_seq.nextVal, '봉제인형 살인사건', 2019, 13150 , 2000, '18');
insert into booklist values(book_seq.nextVal, '쇼코의 미소', 2023, 13420 , 2000, '12');

select * from booklist;

-- 3. 시퀀스 수정 : 최대 증가값을 14까지로 제한
alter sequence book_seq maxvalue 14;

-- 4. 시퀀스 삭제
drop sequence book_seq; 
-- 5. 시퀀스 재생성 : 다음 숫자부터 시작하게 하여 기존 레코드와 중복 되지 않게 한다.
create sequence book_seq start with 15 increment by 1;

-- 1부터 1씩 늘어나는 member_seq rent_seq을 생성
create sequence member_seq start with 1 increment by 1;
create sequence rent_seq start with 1 increment by 1;
