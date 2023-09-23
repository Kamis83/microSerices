package com.wisolv.it.paymentservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApi {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String payLoser(){
        int forPay = 20;
        return " you need to pay " + forPay + "zł Losar " + instanceId;
    }

}
