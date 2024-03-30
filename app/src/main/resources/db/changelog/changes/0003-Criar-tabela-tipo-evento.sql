CREATE TABLE tipo_evento(
  id_tipo_evento SMALLINT PRIMARY KEY NOT NULL,
  titulo VARCHAR(100) NOT NULL
);

INSERT INTO tipo_evento
  VALUES
    (1, 'Show'),
    (2, 'Festa'),
    (3, 'Esportivo');

ALTER TABLE eventos DROP COLUMN eventname;
ALTER TABLE eventos ADD COLUMN id_tipo_evento SMALLINT NOT NULL REFERENCES tipo_evento(id_tipo_evento);