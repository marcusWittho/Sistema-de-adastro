CREATE TABLE eventos(
  id_evento SERIAL PRIMARY KEY,
  eventname VARCHAR(100) NOT NULL,
  address VARCHAR(100) NOT NULL,
  category VARCHAR(11) NOT NULL,
  event_date TIMESTAMP NOT NULL,
  description VARCHAR(200) NOT NULL
);