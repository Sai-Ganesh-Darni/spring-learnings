package com.learning.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Value("${payment-gateway:stripe}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalServicePaymentService();
    }

    @Bean
//    @Scope("prototype")
    public OrderService orderService(){
        return new OrderService(paymentGateway.equals("paypal") ? paypal() : stripe());
    }

    @Value("${user-service.notification-service:email}")
    private String notficationServiceType;

    @Value("${user-service.user-repo:in-memory}")
    private String userRepoType;

    @Bean
    public NotificationService email(){
        return new EmailNotificationService();
    }

    @Bean
    public NotificationService sms(){
        return new SmsNotificationService();
    }

    @Bean
    public UserRepsitory db(){
        return new DbUserRepsitory();
    }

    @Bean
    public UserRepsitory inMemory(){
        return new InMemoryUserRepository();
    }

    @Bean
    public UserService userService(){
        NotificationService notificationService = notficationServiceType.equals("email") ? email() : sms();

        UserRepsitory userRepsitory = userRepoType.equals("db") ? db() : inMemory();
        return new UserService(userRepsitory, notificationService);
    }
}
