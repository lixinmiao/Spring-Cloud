DROP TABLE IF EXISTS user;
CREATE TABLE `user` (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(40),
  age int (3),
  balance FLOAT(10,2),
  PRIMARY KEY  (id)
);