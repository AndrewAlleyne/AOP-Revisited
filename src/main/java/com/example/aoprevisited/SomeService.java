package com.example.aoprevisited;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SomeService {
    //  Store employee name and age
    HashMap<String, Integer> empInfo = new HashMap<>();

    public void doSomething() {
        System.out.println("This function will place an employee into the hashmap.");
        empInfo.put("Andrew", 28);
    }

    public HashMap<String, Integer> doSomething2(HashMap<String, Integer> empInfo) {
        System.out.println("This function will return an employee from the hashmap.");
        empInfo.put("Andrew", 28);
        return empInfo;
    }
}
