import java.util.Scanner;
public class giaiPBT2 {
public static void main(String[]args){
    double a , b , c, x1 ,x2 , delta;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so a ( a # 0): ");
    a = sc.nextDouble();
    System.out.println(" nhap so b: ");
    b = sc.nextDouble();
    System.out.println("nhap so c: ");
    c = sc.nextDouble();
    sc.close();
    System.out.println("phuong trinh bac hai co dang : "+ a +" x^2+"+ b + " x+ "+ c+" =0");
    delta = Math.pow(b, 2) - 4*a*c;
    if( delta < 0){
        System.out.println(" phuong trinh vo nghiem!");
    }else if( delta == 0){
        x1= -b/ (2*a );
        System.out.println("phuong trinh co nghiem duy nhat!" + x1);
    }else{
        x1 = (-b+Math.sqrt(delta)) /(2*a);
        x2 = (-b-Math.sqrt(delta)) /(2*a);
        System.out.println("phuong trinh co 2 nghiem phan biet x1 = " + x1 +"va x2 = " + x2 );
    }

    

}
}
