package com.example.demo.DesignPattern.NullObject;

public class CustomerFactory {
    public static final String[] names= {
            "Rob","Joe","Julie"
    };
    public static AbstractCustomer getCustomer(String name){
        for(int i = 0;i <names.length; i++){
            if(names[i].equalsIgnoreCase(name)){
                return new ReaCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
