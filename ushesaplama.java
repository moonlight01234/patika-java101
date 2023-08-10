import java.util.Scanner;

public class ushesaplama {
    static int usBulma(int x,int y){

        if(x!=0){
            System.out.println(Math.pow(x,y));
            int sayi1,sayi2;
            Scanner scanner=new Scanner(System.in);
            System.out.println("taban değeri:");
            sayi1= scanner.nextInt();
            System.out.println("üs değeri:");
            sayi2= scanner.nextInt();

            return usBulma(sayi1,sayi2);
        }
        else {
            
            return 1;
        }
    }

   public static void main(String[] args) {
       int sayi1,sayi2;
       Scanner scanner=new Scanner(System.in);
       System.out.println("taban değeri:");
       sayi1= scanner.nextInt();
       System.out.println("üs değeri:");
       sayi2= scanner.nextInt();
       usBulma(sayi1,sayi2);

    }
}
