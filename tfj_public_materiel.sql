create table materiel
(
    materiel_id       serial
        constraint materiel_pk
            primary key,
    nom               varchar not null,
    description       text,
    marque            varchar(45),
    marque_url        varchar(2048) default NULL::character varying,
    taille            varchar(5),
    cout_location     numeric,
    cout_remplacement numeric,
    updated_at        timestamp,
    categorie_id      integer
        constraint materiel_categorie__fk
            references categorie
);

alter table materiel
    owner to postgres;

