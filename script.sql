create table episode
(
    id             bigint auto_increment
        primary key,
    episode_name   varchar(255) null,
    season_number  int          null,
    episode_number int          null
);

create table gender
(
    id    bigint auto_increment
        primary key,
    state varchar(255) null
);

create table origin
(
    id          bigint auto_increment
        primary key,
    origin_name varchar(255) null
);

create table app_character
(
    id             bigint auto_increment
        primary key,
    character_name varchar(255) null,
    gender_id      bigint       not null,
    episode_id     bigint       not null,
    origin_id      bigint       not null,
    constraint fk_episode
        foreign key (episode_id) references episode (id),
    constraint fk_gender
        foreign key (gender_id) references gender (id),
    constraint fk_origin
        foreign key (origin_id) references origin (id)
);


