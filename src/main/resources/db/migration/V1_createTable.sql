CREATE TABLE movies (
  id INT NOT NULL AUTO_INCREMENT,
  title VARCHAR(255),
  desc TEXT(500),
  rating BIT(5),
  releasedate VARCHAR(255),
  duration TIME,
  file VARCHAR(255)
  schedule DATETIME,

  PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET ascii COLLATE ascii_general_ci;

CREATE TABLE theaters (
  id INT NOT NULL AUTO_INCREMENT,
  seats INT,
  name VARCHAR(20),

  PRIMARY KEY (id)
)ENGINE=InnoDB CHARACTER SET ascii COLLATE ascii_general_ci;

CREATE TABLE schedules (
  id INT NOT NULL AUTO_INCREMENT,
  movie_id INT UNSIGNED  NOT NULL,
  theater_id INT NOT NULL,
  start_showing TIME,
  finish_showing TIME,
  price INT,

  PRIMARY KEY (id),
  FOREIGN KEY (movie_id) REFERENCES movies(id)
)ENGINE=InnoDB CHARACTER SET ascii COLLATE ascii_general_ci;

CREATE TABLE bookings (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100),
  total INT
)ENGINE=InnoDB CHARACTER SET ascii COLLATE ascii_general_ci;

CREATE TABLE book_schedule (
  schedule_id INT UNSIGNED NOT NULL,
  book_id INT UNSIGNED NOT NULL,
  CONSTRAINT Constr_bookSchedule_movie_fk FOREIGN KEY (movie_id) REFERENCES movies(id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT Constr_bookSchedule_book_fk FOREIGN KEY (book_id) REFERENCES booking(id) ON DELETE CASCADE ON UPDATE CASCADE,
)