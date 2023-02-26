import java.util.Scanner;
public class Menu{
    static void myMethod(){
        int a,b;
        double nghiem;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" nhap so a: ");
            a = sc.nextInt();
            System.out.print(" nhap so b: ");
            b = sc.nextInt();
        }
        // sc.close();
        System.out.print("phuong trinh ban vua nhap la:" + a +"x + " + b + " =0.");
        if( a==0){
         if ( b == 0){
           System.out.println("phuong tirnh co vo so nghiem");
         }else{
           System.out.println("Phuong trinh vo nghiem");
         }
        }else{
         nghiem = (double) -b/a;
         System.out.println("Phuong trinh co nghiem c =  "+ (nghiem)+".");
        }
    }
    static void myMethod1(){
        double a , b , c, x1 ,x2 , delta;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("nhap so a ( a # 0): ");
            a = sc.nextDouble();
            System.out.print(" nhap so b: ");
            b = sc.nextDouble();
            System.out.print("nhap so c: ");
            c = sc.nextDouble();
        }
        // sc.close();
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
    static void myMethod2(){
        float tiendien,sodien;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(" so dien thang nay la: ");
            sodien = sc.nextFloat();
        }
        if( sodien < 50 ){
            tiendien = sodien * 1000;
            System.out.println(" tien dien phai tra thang nay la: "+(tiendien));
        }else if( (sodien > 50) && (sodien <=100)){
            tiendien = sodien*1000+(sodien - 50)*1200;
            System.out.println("tien dien phai tr thang nay la:"+(tiendien));
        }else if( ( sodien > 100 )&&(sodien <= 250)){
            tiendien = sodien*1000+(sodien - 50)*1200;
            System.out.println("tien dien phai tra thanh nay la: "+(tiendien));  
        }else if((sodien > 250)&&(sodien <= 400 )){
            tiendien = sodien*1000+(sodien - 50)*1200;
            System.out.println("tien dien phai tra thang nay la: "+ (tiendien));
        }else{
            System.out.println("vuot qua muc su dung dien!!!!");
        }
    }
    public static void main(String[] args){
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Menu");
            System.out.println("phuong trinh bac nhat");
            System.out.println("phuong trinh bac hai");
            System.out.println("tiendien");
            System.out.println("ket thuc");
            System.out.print("nhap vao number de ra menu: ");
            number = sc.nextInt();
        } 
        // sc.close();
        switch(number){
            case 1:
                myMethod();
                System.out.println("phuong trinh bac nhat");
                break;
            case 2:
                myMethod1();
                System.out.println("phuong trinh bac hai");
                break;   
            case 3:
                myMethod2(); 
                System.out.println("tiendien");
            default:
            break;
        }

        }
        }
        



