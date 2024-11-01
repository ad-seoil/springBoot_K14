create table user_list(
	name varchar2(20) primary key,
	password varchar2(200),
	authority varchar(20),
	enabled number(1)
);