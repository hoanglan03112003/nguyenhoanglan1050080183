import java.util.Scanner;
public class giaiPTB1{
    public static void main(String[] args){
       int a,b;
       double nghiem;
       Scanner sc = new Scanner(System.in);
       System.out.print(" nhap so a: ");
       a = sc.nextInt();
       System.out.print(" nhap so b: ");
       b = sc.nextInt();
       sc.close();
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
}

