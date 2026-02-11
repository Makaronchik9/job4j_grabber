create table if not exists post (
    id serial primary key,
    name varchar(255) not null,
    text text not null,
    link varchar(255) not null unique,
    created timestamp without time zone not null
);
