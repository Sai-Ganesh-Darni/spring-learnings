CREATE TABLE `profiles` (
  `id` BIGINT(255) NOT NULL,
  `bio` TEXT,
  `phone_number` VARCHAR(15) NULL,
  `date_of_birth` DATE NULL,
  `loyalty_points` INT UNSIGNED NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_profile_id`
    FOREIGN KEY (`id`)
    REFERENCES `users` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);
