import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int sayi;
       System.out.println("sayi:");
       sayi= scanner.nextInt();
       for(int i=0;i<sayi;i++){
           for(int j=0;j<sayi;j++){
               if(i==Math.pow(4,j)){
                   System.out.println(i);
               }
               if(i==Math.pow(5,j)){
                   System.out.println(i);
               }
           }

       }
    }
}
