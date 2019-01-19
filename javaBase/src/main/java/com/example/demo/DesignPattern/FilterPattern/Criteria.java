package com.example.demo.DesignPattern.FilterPattern;

import java.util.List;

public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
