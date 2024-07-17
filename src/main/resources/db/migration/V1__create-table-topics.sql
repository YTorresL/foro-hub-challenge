create table topics(
    id bigint not null auto_increment,
    title varchar(100) not null,
    message varchar(500) not null,
    creation_date datetime not null,
    status boolean not null,
    course_id bigint not null,
    user_id bigint not null,
    primary key(id)
);