import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int heat;
        System.out.println("sıcaklık giriniz:");
        heat= scanner.nextInt();

        if(heat<5){
            System.out.println("kayak");
        }
        else if(heat<15 ){
            System.out.println("sinema");
        }
        else if(heat<25){
            System.out.println("piknik");
        }
        else if(heat>25){
            System.out.println("yüzme");
        }
    }
}
