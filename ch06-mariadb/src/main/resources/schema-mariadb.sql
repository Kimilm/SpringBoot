use jpub;

DROP TABLE iF EXISTS TBL_USER;

CREATE TABLE TBL_USER (
  id varchar(40) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(45) NOT NULL
);