ALTER TABLE eventos DROP CONSTRAINT eventos_id_tipo_evento_fkey;
ALTER TABLE eventos DROP COLUMN id_tipo_evento;
DROP INDEX eventos_id_tipo_evento_idx;
ALTER TABLE eventos ADD COLUMN eventname VARCHAR(100) NOT NULL DEFAULT '';

DROP TABLE usuario_evento;

DROP TABLE tipo_evento;