import java.util.Scanner;

public class Tambolunme {


    public static void main(String[] args) {
        int sayi,toplam=0,sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("sayı:");
        sayi= scanner.nextInt();
        for(int i=1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                toplam=toplam+i;
                sayac=sayac+1;
                
            }
        }
        System.out.println("ortalama:"+(toplam/sayac));
    }
}
