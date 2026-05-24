package com.learning.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("SMS sending");
        System.out.println("Message: " +message);
    }
}
