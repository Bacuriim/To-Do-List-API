CREATE TABLE IF NOT EXISTS TASKS (
    id SMALLSERIAL NOT NULL,
    title text NOT NULL,
    content text NOT NULL,
    finished bool NOT NULL,
    PRIMARY KEY(id)
);