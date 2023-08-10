import java.util.Scanner;

public class fatoriyel1 {
    static int factoriel1(int x){
        if(x>1){
           return x* factoriel1(x-1);
        }
        else{
            return 1;
        }
    }
   public static void main(String[] args) {
       int sayi;
       Scanner scanner=new Scanner(System.in);
       System.out.println("sayi:");
       sayi= scanner.nextInt();
       System.out.println(factoriel1(sayi));
    }
}
