package com.learning.store.services;

import com.learning.store.entities.Category;
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

    @Transactional
    public void derviedQueries(){
//        var products = productRepository.findByName("Shampoo");
//        var products = productRepository.findProducts(BigDecimal.valueOf(20L), BigDecimal.valueOf(30L));
//        System.out.println(products.toString());

//        System.out.println(productRepository.countOfProductsBetweenPrice(BigDecimal.valueOf(25L), BigDecimal.valueOf(30L)));

        productRepository.updatePriceByCategory(BigDecimal.valueOf(25L), (byte) 2);

    }

    public void getProducts(){
        var products = productRepository.findProductByCategory(new Category((byte)2));
        products.forEach(System.out::println);
    }

}
