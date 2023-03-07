create table T_USER
(
    USER_ID   varchar2(32) not null,
    USER_NAME varchar2(32) not null,
    PASSWORD  varchar2(128) not null,
    PHONE     varchar2(32) not null,
    constraint t_user_id_pk primary key (USER_ID)
)

create table person
(
    id      number(4) not null,
    name    varchar2(25) not null,
    age     number(2),
    address varchar2(50),
    constraint ps_id_pk primary key (id)
)