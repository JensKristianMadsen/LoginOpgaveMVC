CREATE TABLE IF NOT EXISTS `login-mvc`.`user_info` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `user_email` VARCHAR(45) NOT NULL,
  `user_password` VARCHAR(45) NOT NULL,
PRIMARY KEY (`user_id`));
