package com.example.demo.fastJson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {
    private List<Person> list = new ArrayList<Person>();

    @Test
    public void testPersonToJson(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1,"l","f",new Date()));
        list.add(new Person(2,"l2","f2",new Date()));
        list.add(new Person(3,"l3","f3",new Date()));
        String JsonOutPut = JSON.toJSONString(list);
        System.out.println(JsonOutPut);
    }
    @Test
    public void JsonToObject(){
        Person person = new Person(3,"l3","f3",new Date());
        String jsonObject = JSONObject.toJSONString(person);
        Person newPerson = JSONObject.parseObject(jsonObject,Person.class);
        Assert.assertEquals(newPerson.getAge(),3);

    }
}
