import java.util.Scanner;

public class ucakBileti {
   public static void main(String[] args) {
       int mesafe,yas,yolculukTipi;
       double tutar;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Mesafeyi km türünden giriniz :");
       mesafe= scanner.nextInt();
       System.out.println("Yaşınızı giriniz :");
       yas= scanner.nextInt();
       System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
       yolculukTipi= scanner.nextInt();
       if(mesafe<0 || yas<0){
           System.out.println("Hatalı Veri Girdiniz !");
       }
       else{
       tutar=mesafe*0.10;
       if(yas<12){
           tutar=tutar*0.50;
       }
       else if(yas<24){
           tutar=tutar-(tutar*0.10);
       }
       else if(yas>65){
           tutar=tutar-(tutar*0.30);
       }
       
       if(yolculukTipi==1){
           System.out.println("Toplam Tutar ="+tutar);
       }
       else if(yolculukTipi==2){
           tutar=tutar-(tutar*0.20);
           System.out.println("Toplam Tutar ="+2*tutar);
       }
       else{
           System.out.println("Hatalı Veri Girdiniz !");
       }}


    }
}
