package com.example.demo.fastJson;

import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;

public class nameFilter {
    public static void main(String[] args) {
        NameFilter nameFilter = new NameFilter(){
            public String process(java.lang.Object object, String name, java.lang.Object value){
                return name.toLowerCase();
            }
        };
        SerializeConfig.getGlobalInstance().addFilter(Person.class,nameFilter);
    }
}
