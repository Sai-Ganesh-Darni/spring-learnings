package com.learning.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        System.out.println("Order Service Created!!");
        this.paymentService = paymentService;
    }

    /**
     * This method gets executed after the instance is created for this class
     * - Can be used for any dependency initialisations, to create a DB connections
      */
    @PostConstruct
    public void init(){
        System.out.println("OrderService post-construct");
    }

    /**
     * This methods gets executed before destroying the instance
     * Generally instance gets destroyed when the context is closed
     * - Can be used for clean up operations, close any DB/File connections
     */
    @PreDestroy
    public void cleanUp(){
        System.out.println("OrderService pre-destroy");
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
}
