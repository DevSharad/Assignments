
//1) Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
// The dimensions of the Box are width, height, depth.
// The class should have a method that can return the volume of the box.
// Create an object of the Box class and test the functionalities.



package com.Object.Class;

public class Box {
    private double width;
    private double height;
    private double depth;
        
    public Box(double width, double height, double depth) {
        super();
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double calculateVolume(){
        return (width*height*depth);
    }
        
    public static void main(String[] args) {
        Box box=new Box(1.9,3.7, 1.0);
        System.out.println("Box volume is :"+box.calculateVolume() + " Unit^3");
    }    

}
