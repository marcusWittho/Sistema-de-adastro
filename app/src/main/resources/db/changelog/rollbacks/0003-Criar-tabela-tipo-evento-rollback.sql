ALTER TABLE eventos DROP CONSTRAINT eventos_id_tipo_evento_fkey;
ALTER TABLE eventos DROP COLUMN id_tipo_evento;

ALTER TABLE eventos ADD COLUMN eventname VARCHAR(100) NOT NULL;

DROP TABLE tipo_evento;