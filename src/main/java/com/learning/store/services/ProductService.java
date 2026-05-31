package com.learning.store.services;

import com.learning.store.entities.Product;
import com.learning.store.repositories.CategoryRepository;
import com.learning.store.repositories.ProductRepository;
import com.learning.store.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;


    @Transactional
    public void createWishList(){
        // Create product and category
//        BigDecimal price = new BigDecimal("20.2");
//        var product = Product.builder()
//                .price(price)
//                .name("Soap")
//                .description("Body Soap")
//                .build();
//
//        product.addCategory("Essentials");
//
//        productRepository.save(product);

        // Create a product for Existing category
//        BigDecimal price = new BigDecimal("20.2");
//        var product = Product.builder()
//                .price(price)
//                .name("Shampoo")
//                .description("Shampoo")
//                .build();
//
//        byte category_id = 2;
//        var category = categoryRepository.findById(category_id).orElseThrow();
//        product.addCategory(category);
//
//        productRepository.save(product);

        // Add product to a User's Wishlist
//        var user = userRepository.findById(4L).orElseThrow();
//        productRepository.findAll().forEach(product -> user.getWishlist().add(product));
//        userRepository.save(user);

        // Delete the product
        productRepository.deleteById(1L);

    }

    public void derviedQueries(){
        var products = productRepository.findByName("Shampoo" +
                "");
        System.out.println(products.toString());
    }

}
