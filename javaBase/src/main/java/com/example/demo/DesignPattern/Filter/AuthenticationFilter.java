package com.example.demo.DesignPattern.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Request log:"+request);
    }
}
