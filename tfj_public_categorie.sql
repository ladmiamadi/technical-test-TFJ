create table categorie
(
    categorie_id serial
        constraint categorie_pk
            primary key,
    nom          varchar(50),
    updated_at   timestamp
);

alter table categorie
    owner to postgres;

