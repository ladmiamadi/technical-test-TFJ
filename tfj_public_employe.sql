create table employe
(
    employe_id serial
        constraint employe_pk
            primary key,
    nom        varchar(45),
    prenom     varchar(45),
    image_url  varchar(2048) default NULL::character varying,
    email      varchar(50)   default NULL::character varying,
    login      varchar(16),
    mdp        varchar(40),
    actif      boolean,
    magasin_id integer
        constraint employe_magasin__fk
            references magasin,
    updated_at timestamp
);

alter table employe
    owner to postgres;

