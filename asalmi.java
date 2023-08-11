import java.util.Scanner;

public class asalmi {
    static int asalMi(int x,int y){
        if(y>1){
            if(x%y==0){
                System.out.println("asal değil");
                return 1;
            }
            else{
                return asalMi(x,y-1);
            }
        }
        else{
            System.out.println("asal");
            return  1;
        }
    }

    public static void main(String args[]) {
        int sayi,sayi2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi:");
        sayi= scanner.nextInt();
        sayi2=sayi-1;
        asalMi(sayi,sayi2);


    }

}
