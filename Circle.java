 package lab4;
 public class Circle{
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color =" red ";
        System.out.println("Cricle()");
    }
    public Circle (double radius){
        this.radius = radius;
        this.color = "red";
        System.out.println("Circle(radius,color)");
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        System.out.println("Circle(radius,color)");
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius= radius;
    }
    public void setColor(){
        this.color= "red";
    }
    public String toString(){
        return "Circle[radius =" +radius+",color="+color +"]";
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
 }
