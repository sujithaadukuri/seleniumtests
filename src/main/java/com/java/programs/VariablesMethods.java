package com.java.programs;

public class VariablesMethods {
   int  puppyage;
    String puppyname;
    public void setPuppyage(int age){
        puppyage=age;
    }
    public int getPuppyage(){
        System.out.println("puppyage:"+puppyage);
        return puppyage;
    }
    public void setPuppyname(String name){
        puppyname=name;
    }
    public String getPuppyname(){
        System.out.println("puppyname:"+puppyname);
        return puppyname;
    }

    public static void main(String[] args) {
            VariablesMethods mypuppy=new VariablesMethods();
            mypuppy.setPuppyage(4);
            mypuppy.getPuppyage();
            mypuppy.setPuppyname("tony");
            mypuppy.getPuppyname();

       System.out.println("intvariable:" +mypuppy.puppyage);
        System.out.println("stringvariable:" +mypuppy.puppyname);
    }
}
