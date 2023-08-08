import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String username,password,Gusername="patika",Gpassword="123";
        Scanner scanner=new Scanner((System.in));
        System.out.println("kullanıcı adı:");
        username= scanner.nextLine();
        System.out.println("şifre:");
        password= scanner.nextLine();

        if(username.equals(Gusername) && password.equals(Gpassword)){
            System.out.println("giriş başarılı");
        }
        else if(username.equals("patika") && !password.equals("123")){
            System.out.print("şifre yanlış\nşifreyi sıfırlamak ister misiniz(y/n)?");
            String secim= scanner.nextLine();
            if(secim.equals("y")){
                System.out.print("yeni şifre:");
                String Ypassword= scanner.nextLine();
                if(Ypassword.equals(Gpassword)){
                    System.out.println("yeni şifreniz eskisi ile aynı olamaz");
                }
                else{
                    System.out.println("şifreniz yenilendi.");
                    Gpassword=Ypassword;
                }
            }
        }
        else if(!username.equals("patika") && password.equals("123")){
            System.out.println("kullanıcı adı yanlış");
        }
        else{
            System.out.println("kullanıcı adı ve şifre yanlış");
        }
    }
}
