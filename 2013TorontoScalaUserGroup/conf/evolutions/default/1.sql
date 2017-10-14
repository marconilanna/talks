# Computers table

# --- !Ups

create table computer
  ( id                 bigint         not null auto_increment primary key
  , name               varchar(30)    not null
  , introduced         timestamp      null
  , discontinued       timestamp      null
  )
  engine=InnoDB;

# --- !Downs

drop table computer;
