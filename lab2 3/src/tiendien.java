import java.util.Scanner;

public class tiendien {
    public static void main(String[]args){
        float tiendien,sodien;
        Scanner sc = new Scanner(System.in);
        System.out.println(" so dien thang nay la: ");
        sodien = sc.nextFloat();
        sc.close();
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
}
