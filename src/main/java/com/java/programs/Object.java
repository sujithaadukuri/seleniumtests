package com.java.programs;

public class Object {
    String name;
    public Object(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public String tostring(){
        return ("my name is:"+this.getName());
    }

    public static void main(String[] args) {
        Object obj=new Object("john");
        System.out.println(obj.tostring());
    }

}
