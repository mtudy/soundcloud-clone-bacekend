create table album_like (
    id varchar(36) not null,
    authorId varchar(36) not null,
    albumId varchar(36) not null,
    primary key (id)
) engine=InnoDB collate=utf8mb4_general_ci
