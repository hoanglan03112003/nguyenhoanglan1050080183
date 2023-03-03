package lab4;

public class TestCylinder {
    public static void main(String[]args){
        Cylinder cy1 = new Cylinder();
        System.out.println("radius:" +cy1.getRadius()
        +",height " + cy1.getHeight()
        +", color"+ cy1.getColor()
        +",Base area"+ cy1.getArea()
        +",Volume"+ cy1.getVolume());

         Cylinder cy2 = new Cylinder(5,2);
         System.out.println("radius" +cy2.getRadius()
        +", color"+ cy2.getColor()
        +",Base area"+ cy2.getArea()
        +",Volume"+ cy2.getVolume()
        +",height " + cy2.getHeight());
        
    }

}
