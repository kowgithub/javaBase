package com.example.demo.DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<Person>();

        person.add(new Person("a","male","Single"));
        person.add(new Person("b","female","Married"));
        person.add(new Person("c","male","Single"));
        person.add(new Person("d","female","Single"));
        person.add(new Person("e","male","Single"));
        person.add(new Person("f","female","Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singlemale = new AndCriteria(single,male);
        Criteria singleorfemale = new OrCriteria(single,female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(person));

        System.out.println("Female");
        printPersons(female.meetCriteria(person));

        System.out.println("Single Males");
        printPersons(singlemale.meetCriteria(person));

        System.out.println("Single or Female");
        printPersons(singleorfemale.meetCriteria(person));



    }
    public static void printPersons(List<Person> persons){
        for(Person person:persons){
            System.out.println(person.getName()+person.getGender()+person.getMaritalStatus());
        }
    }
}
