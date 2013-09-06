-- drop table signon if exists;
-- drop table account if exists;

create database fruitstore;
use fruitstore;

create table signon (
    username varchar(25) not null,
    password varchar(25)  not null,
    usertype varchar(25) null,
    constraint pk_signon primary key (username)
);


create table account (
    userid varchar(80) not null,
    email varchar(80) null,
    firstname varchar(80) null,
    lastname varchar(80) not null,
    status varchar(2)  null,
    
    addr1 varchar(80) null,
    addr2 varchar(40) null,
    city varchar(80)  null,
    state varchar(80) null,
    zip varchar(20) null,
    
    country varchar(20) null,
    mobile varchar(50) null,
    phone varchar(80) null,
    constraint pk_account primary key (userid)
);

CREATE TABLE sequence
(
    name               varchar(30)  not null,
    nextid             int          not null,
    constraint pk_sequence primary key (name)
);
