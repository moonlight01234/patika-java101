import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km,StartPrice=10;
        double perKm=0.2,total;
        Scanner scanner=new Scanner(System.in);

        System.out.println("mesafe:");
        km= scanner.nextInt();

        total=km*perKm;
        if(total<10){
            System.out.println(StartPrice);
        }
        else{
            System.out.println(total+StartPrice);
        }

    }
}
