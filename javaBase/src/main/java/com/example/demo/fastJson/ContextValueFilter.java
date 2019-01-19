package com.example.demo.fastJson;

import com.alibaba.fastjson.JSON;

import java.beans.beancontext.BeanContext;

public class ContextValueFilter {


    public static void main(String[] args) {

        ContextValueFilter valueFilter = new ContextValueFilter(){
            public java.lang.Object process(BeanContext context, Object object, String name, java.lang.Object value) {
                if(name.equals("DATE OF BIRTH")){
                    return "NOT TO DISCLOSE";
                }
                if(value.equals("john")){
                    return ((String)value).toUpperCase();
                }else {
                    return null;
                }
            }
        };
      String s = JSON.toJSONString(new Person());
        System.out.println(s);
    }
}

