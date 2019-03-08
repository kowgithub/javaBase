package com.example.demo.DesignPattern.BusinessDelegate;

public class BusinessDelegate {
    private BusinessLookUp lookUp = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUp.getBussinessService(serviceType);
        businessService.doProcessimg();
    }
}
