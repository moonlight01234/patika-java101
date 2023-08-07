import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        int a,b,c;
        double cevreyarisi,alan;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. kenar:");
        a= scanner.nextInt();
        System.out.println("2. kenar:");
        b= scanner.nextInt();
        System.out.println("3. kenar:");
        c= scanner.nextInt();
        cevreyarisi=(a+b+c)/2;
        alan=Math.sqrt(cevreyarisi*(cevreyarisi-a)*(cevreyarisi-b)*(cevreyarisi-c));
        System.out.println("alan:"+alan);
    }
}
