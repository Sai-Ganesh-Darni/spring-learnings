package com.learning.store;

import com.learning.store.entities.Address;
import com.learning.store.entities.Profile;
import com.learning.store.entities.User;
import com.learning.store.repositories.UserRepository;
import com.learning.store.services.ProductService;
import com.learning.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var userRepository = context.getBean(UserRepository.class);
//        User user = new User(1L, "Sai", "saiganesh@gmail.com", "pwd123");
//        var user  = User
//                .builder()
//                .name("Sai")
//                .email("saiganesh@gmail.com")
//                .password("pwd123")
//                .build();
//
//        userRepository.save(user);

//        var user = userRepository.findById(1L).orElseThrow();


//        userRepository.findAll().forEach(u -> System.out.println(u.getEmail()));

//        var user = userRepository.findById(2L).orElseThrow();
//        user.setEmail("temp@gmail.com");
//        userRepository.save(user);

//        userRepository.deleteById(2L);

//        var userService = context.getBean(UserService.class);
//        userService.showEntityStates();
//        userService.showRelatedEntities();
//            userService.getAddress();
//        userService.persistRelated();
//        userService.deleteRelated();
        var productService  = context.getBean(ProductService.class);

//        productService.derviedQueries();
        productService.getProducts();
	}

}
