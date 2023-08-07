import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        double tutar,kdvOrani;
        Scanner scanner=new Scanner(System.in);
        System.out.println("tutar:");
        tutar= scanner.nextInt();
        if(tutar<1000){
            kdvOrani=0.08;
            tutar=tutar+tutar*kdvOrani;
            System.out.println("kdv'li tutar:"+tutar);
        }
        if(tutar>1000){
            kdvOrani=0.18;
            tutar=tutar+tutar*kdvOrani;
            System.out.println("kdv'li tutar:"+tutar);
        }
    }
}
