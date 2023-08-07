import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {
        double boy,index;
        int kilo;
        Scanner scanner=new Scanner(System.in);
        System.out.println("boy:");
        boy= scanner.nextInt();
        System.out.println("kilo:");
        kilo= scanner.nextInt();
        index=kilo/boy*boy;
        System.out.println("index:"+index);

    }
}
