package com.learning.store.repositories;

import com.learning.store.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,  Long> {
}

