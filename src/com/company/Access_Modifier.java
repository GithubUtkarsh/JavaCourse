package com.company;

class Myemployee{
    private int id;
    private String name;
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

}

public class Access_Modifier {
    public static void main(String[] args) {
        Myemployee harry = new Myemployee();
//        harry.id=213;
//        harry.name="CodeWithHarry"; -> Throws an error because of access modifier

        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

        harry.setId(44);
        System.out.println(harry.getId());

    }
}
