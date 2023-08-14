import java.util.Scanner;

public class Harmonik {

    public static void main(String args[]) {
        int sayi;
        double sonuc=0.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi:");
        sayi= scanner.nextInt();

        for(double i=1;i<=sayi;i++){
            sonuc=sonuc+(1/i);
        }
        System.out.println(sonuc);

    }

}
