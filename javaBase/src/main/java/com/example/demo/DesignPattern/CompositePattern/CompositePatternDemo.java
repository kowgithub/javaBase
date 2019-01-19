package com.example.demo.DesignPattern.CompositePattern;

public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("john", "CEO", 30000);

        Employee headSales = new Employee("a", "headSales", 20000);
        Employee headMarket = new Employee("aa", "headMarket", 20000);

        Employee clerk1 = new Employee("b", "clerk", 10000);
        Employee clerk2 = new Employee("c", "clerk", 10000);

        Employee sales1 = new Employee("d", "sales", 10000);
        Employee sales = new Employee("e", "sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarket);

        headSales.add(sales);
        headSales.add(sales1);

        headMarket.add(clerk1);
        headMarket.add(clerk2);

        System.out.println(CEO);
        for(Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for(Employee employee :headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }


    }
}
