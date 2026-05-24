package com.learning.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public OrderService orderService(){
        return new OrderService(paymentGateway.equals("paypal") ? paypal() : stripe());
    }
}
