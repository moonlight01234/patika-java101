import java.util.Scanner;

public class sinifiGecme {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,muzik,bolu=5;

        double ort;
        Scanner scanner=new Scanner(System.in);
        System.out.println("matematik not:");
        mat=scanner.nextInt();
        if(mat>100 || mat<0){
            mat=0;
            --bolu;
        }
        System.out.println("fizik not:");
        fizik=scanner.nextInt();
        if(fizik>100 || fizik<0){
            fizik=0;
            --bolu;
        }
        System.out.println("kimya not:");
        kimya=scanner.nextInt();
        if(kimya>100 || kimya<0){
            kimya=0;
            --bolu;
        }
        System.out.println("turkce not:");
        turkce=scanner.nextInt();
        if(turkce>100 || turkce<0){
            turkce=0;
            --bolu;
        }
        System.out.println("muzikk not:");
        muzik=scanner.nextInt();
        if(muzik>100 || muzik<0){
            muzik=0;
            --bolu;
        }
        ort=(mat+fizik+kimya+turkce+muzik)/bolu;
        if(ort<=55){
            System.out.println("kaldınız.");
            System.out.println("ort:"+ort);
        }
        if(ort>55){
            System.out.println("geçtiniz.");
            System.out.println("ort:"+ort);
        }
    }
}
