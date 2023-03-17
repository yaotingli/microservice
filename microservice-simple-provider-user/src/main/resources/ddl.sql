create table T_USER
(
    USER_ID   varchar2(32) not null,
    USER_NAME varchar2(32) not null,
    PASSWORD  varchar2(128) not null,
    PHONE     varchar2(32) not null,
    constraint t_user_id_pk primary key (USER_ID)
)

create table PERSON
(
    id      number(4) not null,
    name    varchar2(25) not null,
    age     number(2),
    address varchar2(50),
    constraint ps_id_pk primary key (id)
)

===================================mysql=========================

CREATE TABLE `Person`
(
    `id`      int          NOT NULL,
    `name`    varchar(255) NOT NULL,
    `age`     tinyint      DEFAULT NULL,
    `address` varchar(128) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE `T_USER`
(
    `USER_ID`   varchar(32)  NOT NULL,
    `USER_NAME` varchar(32)  NOT NULL,
    `PASSWORD`  varchar(128) NOT NULL,
    `PHONE`     varchar(12)  NOT NULL,
    PRIMARY KEY (`USER_ID`),
    UNIQUE KEY `uiq_phone` (`PHONE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

