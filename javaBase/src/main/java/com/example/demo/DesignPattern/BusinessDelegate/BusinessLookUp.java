package com.example.demo.DesignPattern.BusinessDelegate;

public class BusinessLookUp {
    public BusinessService getBussinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
