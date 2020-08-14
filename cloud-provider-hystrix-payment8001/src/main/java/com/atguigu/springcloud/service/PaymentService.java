package com.atguigu.springcloud.service;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_OK "+id+"\t";
    }

    public String paymentInfo_TIMEOUT(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+" paymentInfo_TIMEOUT "+id+"\t";
    }


}
