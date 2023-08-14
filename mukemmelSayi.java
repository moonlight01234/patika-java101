import java.util.Scanner;

public class mukemmelSayi {
    static void mukemmel(int x){
        int toplam=0;
        for(int i=1;i<x;i++){
            if(x%i==0){

                toplam=toplam+i;

            }
        }

        if(toplam==x){
            System.out.println(x+" mükemmel sayıdır.");
        }
        else{
            System.out.println("mükemmel sayı değildir.");
        }
    }

    public static void main(String args[]) {
       int sayi;
       Scanner scanner =new Scanner(System.in);
        System.out.println("sayi:");
        sayi= scanner.nextInt();
        mukemmel(sayi);

    }

}
