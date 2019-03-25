package com.example.ttcproject2.testClients;

import java.util.List;

import com.example.ttcproject2.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.ttcproject2.domain.*;
import com.example.ttcproject2.utility.*;

public class FacilityTestClient {
    public FacilityTestClient() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        //CustomerService customerService = (CustomerService) context.getBean("customerService");



    }
}
