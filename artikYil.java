import java.util.Scanner;
public class artikYil {

    public static void main(String args[]) {
        int yil;
        Scanner scanner=new Scanner(System.in);
        System.out.println("yıl:");
        yil= scanner.nextInt();

        if(yil%100==0){
            if(yil%400==0){
                System.out.println("artık yıl");
            }
            else{
                System.out.println("artık yıl değil");
            }
        }
        else if(yil%4==0){
            System.out.println("artık yıl");
        }
        else{
            System.out.println("artık yıl değil");
        }
    }

}
