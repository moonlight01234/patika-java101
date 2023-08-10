import java.util.Arrays;
import java.util.Scanner;

public class siralama {

   public static void main(String[] args) {
       int boyut;
       Scanner scanner=new Scanner(System.in);
       System.out.println("boyut:");
       boyut= scanner.nextInt();
       int[] dizi=new int[boyut];
       for(int i=0;i<dizi.length;i++){
           System.out.println((i+1)+".sayı:");
           dizi[i]= scanner.nextInt();
       }
       dizi=Arrays.stream(dizi).sorted().toArray();
       for(int i=0;i< dizi.length;i++){
           System.out.println(dizi[i]);
       }

    }
}
