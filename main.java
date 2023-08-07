import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        double ort;
        Scanner scanner=new Scanner(System.in);
        System.out.println("matematik not:");
        mat=scanner.nextInt();
        System.out.println("fizik not:");
        fizik=scanner.nextInt();
        System.out.println("kimya not:");
        kimya=scanner.nextInt();
        System.out.println("turkce not:");
        turkce=scanner.nextInt();
        System.out.println("muzikk not:");
        muzik=scanner.nextInt();
        ort=(mat+fizik+kimya+turkce+muzik)/5;
        System.out.println("Ortalamanız: " +ort + (ort >= 60 ? " \nDurumunuz: geçtiniz" : "\nDurumunuz: kaldınız")) ;
    }
}
