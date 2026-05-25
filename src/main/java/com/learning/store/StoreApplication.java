package com.learning.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        var orderService2 = context.getBean(OrderService.class);
//        orderService.placeOrder();
//        var notficationManager = context.getBean(NotificationManager.class);
//        notficationManager.sendNotification("Hello");
//        var heavyResource = context.getBean(HeavyResource.class);

//        var userService = context.getBean(UserService.class);
//        User newUser = new User(1234, "saiganesh@gmail.com", "hash123", "Sai Ganesh");
//        userService.registerUser(newUser);
//        User newUser2 = new User(12314, "saiganesh1@gmail.com", "hash123", "Sai Ganesh");
//        userService.registerUser(newUser2);
//        userService.getUsers();
        context.close();
	}

}
