CREATE TABLE `store`.`wishlist` (
  `user_id` BIGINT NOT NULL,
  `product_id` BIGINT NOT NULL,


  INDEX `fk_wishlist_product_id_idx` (`product_id` ASC) VISIBLE,

  CONSTRAINT `pk_wishlist` PRIMARY KEY (`user_id`, `product_id`),

  CONSTRAINT `fk_wishlist_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `store`.`users` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

  CONSTRAINT `fk_wishlist_product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `store`.`product` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);