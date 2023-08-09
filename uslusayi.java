import java.util.Scanner;

public class uslusayi {
   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int sayi1,sayi2,total=1;
       System.out.println("sayi1:");
       sayi1= scanner.nextInt();
       System.out.println("sayi2:");
       sayi2= scanner.nextInt();

       for(int i=0;i<sayi2;i++){
           total=total*sayi1;
       }

       System.out.println(total);

    }
}
