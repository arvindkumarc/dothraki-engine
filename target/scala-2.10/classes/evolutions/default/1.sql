# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "screens" ("id" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR(254) NOT NULL,"location" VARCHAR(254) NOT NULL);
create table "seats" ("id" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR(254) NOT NULL,"session_id" BIGINT NOT NULL);
create table "sessions" ("id" SERIAL NOT NULL PRIMARY KEY,"name" VARCHAR(254) NOT NULL,"screen_id" BIGINT NOT NULL);

# --- !Downs

drop table "screens";
drop table "seats";
drop table "sessions";

