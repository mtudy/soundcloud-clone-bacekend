create table track (
    id varchar(36) not null,
    authorId varchar(36) not null,
    title varchar(255) not null,
    artworkUrl varchar(255) not null,
    primary key (id)
) engine=InnoDB collate=utf8mb4_general_ci
