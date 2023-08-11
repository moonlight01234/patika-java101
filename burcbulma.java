import java.util.Scanner;

public class burcbulma {
    public static void main(String args[]) {
        int yas,mod;
        String burc=" ";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz :");
        yas= scanner.nextInt();
        mod=yas%12;
        if(mod==0){
         burc="maymun";
        }
        if(mod==1){
            burc="horoz";
        }
        if(mod==2){
            burc="köpek";
        }
        if(mod==3){
            burc="domuz";
        }
        if(mod==4){
            burc="fare";
        }
        if(mod==5){
            burc="öküz";
        }
        if(mod==6){
            burc="kaplan";
        }
        if(mod==7){
            burc="tavşan";
        }
        if(mod==8){
            burc="ejderha";
        }
        if(mod==9){
            burc="yılan";
        }
        if(mod==10){
            burc="at";
        }
        if(mod==11){
            burc="koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz :"+burc);

    }

}
