package com.company;
class MyMainemployee{
    private int id;
    private String name;
    private int salary;

    public MyMainemployee(){
        id = 55;
        name = "Enter-Your-Name";
        salary = 100000;
    }

    public MyMainemployee(String myname,int myid,int Mysalary){
        name = myname;
        id = myid;
        salary = Mysalary;
    }
    public MyMainemployee(String n){
        name = n;
    }
    public MyMainemployee(int Mysalary){
        salary = Mysalary;
    }
    public String  getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int a){
        this.id = a;
    }
    public int getSalary(){
        return salary;
    }


}
public class Constructor_class {
    public static void main(String[] args) {
//        MyMainemployee harry = new MyMainemployee("CodeWithHarry");
//        MyMainemployee harry = new MyMainemployee("CodeWithHarry",323);
        MyMainemployee harry = new MyMainemployee("Harry",32,1000000);
//        harry.setId(23);
//        harry.setName("CodeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

    }
}
