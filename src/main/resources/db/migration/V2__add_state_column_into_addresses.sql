ALTER TABLE `store`.`addresses`
ADD COLUMN `state` VARCHAR(255) NOT NULL AFTER `user_id`;