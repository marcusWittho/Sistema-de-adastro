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
ALTER TABLE eventos ADD COLUMN id_tipo_evento SMALLINT;
ALTER TABLE eventos
  ADD CONSTRAINT eventos_id_tipo_evento_fkey
  FOREIGN KEY (id_tipo_evento)
  REFERENCES tipo_evento(id_tipo_evento);
CREATE INDEX eventos_id_tipo_evento_idx ON eventos(id_tipo_evento);

CREATE TABLE usuario_evento(
  id_usuario_evento SERIAL PRIMARY KEY,
  id_usuario INTEGER NOT NULL REFERENCES usuario(id_usuario),
  id_evento INTEGER NOT NULL REFERENCES eventos(id_evento)
);
CREATE INDEX usuario_evento_id_usuario_idx ON usuario_evento(id_usuario);
CREATE INDEX usuario_evento_id_evento_idx ON usuario_evento(id_evento);
