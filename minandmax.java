import java.util.Arrays;
import java.util.Scanner;

public class minandmax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("kaç tane sayı gireceksiniz:");
        int sayi= scanner.nextInt();
        int[] dizi=new int[sayi];
        for(int i=0;i<sayi;i++){
            System.out.println("girmek istediğiniz sayı:");
            dizi[i]= scanner.nextInt();
        }
        System.out.println("en büyük:"+Arrays.stream(dizi).max().getAsInt());
        System.out.println("en küçük"+Arrays.stream(dizi).min().getAsInt());

    }
}
