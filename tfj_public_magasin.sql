create table magasin
(
    magasin_id serial
        constraint magasin_pk
            primary key,
    ville      varchar,
    updated_at varchar
);

alter table magasin
    owner to postgres;

