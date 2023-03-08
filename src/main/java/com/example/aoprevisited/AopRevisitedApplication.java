package com.example.aoprevisited;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;


@SpringBootApplication
@EnableAspectJAutoProxy
public class AopRevisitedApplication {
    private final SomeService someService;
    private final AnotherService anotherService;

    public AopRevisitedApplication(AnotherService anotherService, SomeService someService) {
        this.anotherService = anotherService;
        this.someService = someService;
    }

    public static void main(String[] args) {
        // Asynchronous return.
        SpringApplication.run(AopRevisitedApplication.class, args);
    }

    //    After the ApplicationContext initializes then do this immediately.
    @PostConstruct
    /*  To simulate calls to the functions that may be called using the Controller or differing services*/
    public void afterContextLoads() {
        someService.doSomething();
        someService.doSomething2(new HashMap<String, Integer>());
        anotherService.someOtherMethod();
    }
}
