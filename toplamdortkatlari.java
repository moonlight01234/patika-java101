import java.util.Scanner;

public class toplamdortkatlari {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sayi,toplam=0;
        do{
            System.out.println("sayi:");
            sayi= scanner.nextInt();
            if(sayi%4==0 ){
                toplam=toplam+sayi;
            }
        }
         while(sayi%2==0);
        System.out.println(toplam);

    }
}
