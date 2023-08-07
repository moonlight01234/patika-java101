import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int a,b,secim;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayı:");
        a= scanner.nextInt();
        System.out.println("2.sayı:");
        b= scanner.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        secim= scanner.nextInt();

        switch (secim){

            case 1:
                System.out.println("toplam:"+(a+b));
                break;

            case 2:
                System.out.println("çıkarma:"+(a-b));
                break;

            case 3:
                System.out.println("çarpma:"+(a*b));
                break;

            case 4:
                System.out.println("bölme:"+(a/b));
                break;
        }
    }
}
