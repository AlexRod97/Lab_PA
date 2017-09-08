package org.eclipse.che.examples;

public class Rectangle implements Shape {
    
    private double length; 
    private double width; 
    
    public Rectangle(double length, double width) {
        this.length = length; 
        this.width = width; 
    }
    
   public double getArea() {
        return this.length * this.width; 
    }
    
    public String toString() {
        return "Rectangle [ length: " + this.length + "width: " + this.width + " ] area = " + getArea();  
    }

}
