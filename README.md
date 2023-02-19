# Introduction

This is a sample demo microservice created using Spring Boot and Spring Data having Casandra as DB 

# Pre Request 

## cassandra
### Install cassadra in local using docker repository .

docker pull cassandra:latest

docker run --name cassandra -p 127.0.0.1:9042:9042 -p 127.0.0.1:9160:9160   -d cassandra

### Create Key Space and create sample tables 

CREATE KEYSPACE IF NOT EXISTS lms WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : '1' };

create table if not exists lms.pa_course( course_guid uuid primary key ,course_title text ,total_hours float,source text , last_update_user text,last_update_timestamp timestamp);

insert into lms.pa_course( course_guid,course_title,total_hours,source,last_update_user,last_update_timestamp)
values (uuid(), 'MS Office 2022',10.0,'EDX','test_user1', toTimeStamp(now()));

insert into lms.pa_course( course_guid,course_title,total_hours,source,last_update_user,last_update_timestamp)
values (uuid(), 'Java Spring in Action',10.0,'EDX','test_user1', toTimeStamp(now()));

##kafka 

### Install kafka in local using docker repository .
https://www.baeldung.com/ops/kafka-docker-setup


## consul
### Install consul in local using docker repository .

https://developer.hashicorp.com/consul/tutorials/day-0/docker-container-agents

### Configure consul key value properties

Configure key value 

spring.data.cassandra.contact-points=localhost

spring.data.cassandra.keyspace-name=lms

spring.data.cassandra.port=9042

kafka.bootstapserver=localhost:29092

# Run this application 

### Clone this repository

git clone https://github.com/javaminiature/miniaturelms.git .

### Run the application 

gradle build 
gradle bootRun
