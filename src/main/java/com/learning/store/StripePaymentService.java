package com.learning.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
@Qualifier
public class StripePaymentService implements PaymentService{

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: "+amount);
        System.out.println("API URL: "+apiUrl);
        System.out.println("Enabled: "+enabled);
        System.out.println("supportedCurrencies: "+supportedCurrencies);

    }
}
