CREATE SEQUENCE seq_member;

CREATE TABLE member ( 
	name varchar(30) not null,
	email varchar(100) not null primary key,
	message varchar(1000) not null
);


INSERT INTO member (name, email, message)
VALUES ('홍길동', 'admin@test.com', 'test');

INSERT INTO member (name, email, message)
VALUES ('테스트', 'asdasd@asdas.com', '테스트');


CREATE TABLE board ( 
	id int not null primary key,
	title varchar(100) not null,
	contents varchar(3000) not null,
	author varchar(30),
	registDate timestamp,
	modifyDate timestamp
);

INSERT INTO board (id, title, contents, author)
VALUES (1, '게시판 테스트1', '테스트1', '최강훈');

INSERT INTO board (id, title, contents, author)
VALUES (2, '게시판 테스트2', '테스트2', '최강훈');

INSERT INTO board (id, title, contents, author)
VALUES (3, '게시판 테스트3', '테스트3', '최강훈');

