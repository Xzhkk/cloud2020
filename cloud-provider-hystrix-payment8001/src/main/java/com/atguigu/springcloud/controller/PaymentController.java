package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
       String result = paymentService.paymentInfo_OK(id);
       return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TIMEOUT(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_TIMEOUT(id);
        return result;
    }
}
