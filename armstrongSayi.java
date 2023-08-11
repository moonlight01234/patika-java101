import java.util.Scanner;

public class armstrongSayi {
    public static void main(String args[]) {
        int sayi,basamak=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi:");
        sayi= scanner.nextInt();
        while(sayi!=0){
            basamak=basamak+sayi%10;
            sayi=sayi/10;
        }
        System.out.println(basamak);
    }

}
