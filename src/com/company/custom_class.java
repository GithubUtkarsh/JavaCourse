package com.company;

class Employee1{
    int id;
    int salary;
    String name;

    public void show(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is out custom class");
        Employee1 harry = new Employee1();
        Employee1 john = new Employee1();

        // Setting Attributes for Harry
        harry.id = 01;
        harry.salary = 34;
        harry.name= "CodeWithHarry";

        // Setting Attributes for John
        john.id = 02;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.show();
        john.show();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
