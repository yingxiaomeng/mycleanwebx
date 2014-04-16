package com.haohao.reflect;

public class Car {
    String name;
    String colorString;
    
    public Car(){
        System.out.println("call Car() constructor");
    }
   
    
    @Override
    public String toString() {
        return "Car [name=" + name + ", colorString=" + colorString + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("call setName()");
        this.name = name;
    }
    public String getColorString() {
        return colorString;
    }
    public void setColorString(String colorString) {
        System.out.println("call setColorString()");
        this.colorString = colorString;
    }
    
    

}
