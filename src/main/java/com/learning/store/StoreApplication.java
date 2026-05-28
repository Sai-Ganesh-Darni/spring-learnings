package com.learning.store;

import com.learning.store.entities.Address;
import com.learning.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        User user = new User(1L, "Sai", "saiganesh@gmail.com", "pwd123");
        var user  = User
                .builder()
                .name("Sai")
                .id(1L)
                .email("saiganesh@gmail.com")
                .password("pwd123")
                .build();


        user.addTag("tag1");
//        user.removeAddress(address);

        System.out.println(user);


	}

}
