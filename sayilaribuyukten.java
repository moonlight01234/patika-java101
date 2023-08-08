import java.util.Scanner;

public class sayilaribuyukten {
    public static void main(String[] args) {
       int a,b,c;
       Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayı:");
        a= scanner.nextInt();
        System.out.println("2.sayı:");
        b= scanner.nextInt();
        System.out.println("3.sayı:");
        c= scanner.nextInt();
        if((a>b)&&(b>c)){
            System.out.println("a>b>c");
        }
        else if((a>c)&&(c>b)){
            System.out.println("a>c>b");
        }
        else if((b>a)&&(a>c)){
            System.out.println("b>a>c");
        }
        else if((b>c)&&(c>a)){
            System.out.println("b>c>a");
        }
        else if((c>a)&&(a>b)){
            System.out.println("c>a>b");
        }
        else if((c>b)&&(b>a)){
            System.out.println("c>b>a");
        }


    }
}
