package com.learning.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("EMAIL sending");
        System.out.println("Message: "+message);
    }
}
