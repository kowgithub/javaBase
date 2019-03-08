package com.example.demo.DesignPattern.FrontControllerPattern;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successful");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("page requested:"+request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
