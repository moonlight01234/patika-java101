import java.util.Arrays;
import java.util.Scanner;

public class maxandmin {

   public static void main(String[] args) {
       int sayi,max,j=0;
       Scanner scanner=new Scanner(System.in);
       int[] dizi=new int[]{15,12,788,1,-1,-778,2,0};

       System.out.println("sayi:");
       sayi= scanner.nextInt();
       max=-1000;
       dizi=Arrays.stream(dizi).sorted().toArray();


       for(int i=0;i< dizi.length;i++){
          if(max<dizi[i] && sayi>dizi[i]){
              max=dizi[i];
          }
       }
       for(j=0;j<dizi.length;j++){
           if(max==dizi[j]){
               break;
           }
       }
       System.out.println("Girilen sayıdan küçük en yakın sayı :"+max);
       System.out.println("Girilen sayıdan büyük en yakın sayı :"+dizi[j+1]);


    }
}
