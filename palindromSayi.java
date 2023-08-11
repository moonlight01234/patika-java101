import java.util.Scanner;

public class palindromSayi {
    public static void main(String args[]) {
        String sayi;
        int sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi:");
        sayi= scanner.nextLine();
        for(int i=0;i<sayi.length()/2;i++){
            if(sayi.charAt(i)!=sayi.charAt(sayi.length()-1)){
                sayac=1;
                break;
            }
        }
        if(sayac==0){
            System.out.println("palindrom sayi");
        }
        else if(sayac==1){
            System.out.println("palindrom sayi değil");
        }



    }

}
