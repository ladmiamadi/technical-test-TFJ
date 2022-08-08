create table inventaire
(
    inventaire_id serial
        constraint inventaire_pk
            primary key,
    updated_at    timestamp,
    materiel_id   integer
        constraint inventaire_materiel__fk
            references materiel
            on update cascade on delete cascade,
    magasin_id    integer
        constraint inventaire_magasin__fk
            references magasin
            on update cascade on delete cascade
);

alter table inventaire
    owner to postgres;

