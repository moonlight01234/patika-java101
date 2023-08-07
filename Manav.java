import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,total=0;
        int kilo;

        Scanner scanner=new Scanner(System.in);
        System.out.println("armut:");
        kilo= scanner.nextInt();
        total=total+kilo*armut;
        System.out.println("elma:");
        kilo= scanner.nextInt();
        total=total+kilo*elma;
        System.out.println("domates:");
        kilo= scanner.nextInt();
        total=total+kilo*domates;
        System.out.println("muz:");
        kilo= scanner.nextInt();
        total=total+kilo*muz;
        System.out.println("patlıcan:");
        kilo= scanner.nextInt();
        total=total+kilo*patlican;

        System.out.println("total:"+total);




    }
}
