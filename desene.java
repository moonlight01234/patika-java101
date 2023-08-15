import java.util.Scanner;

public class desene {
    static int dongu(int x,int y,int z){
        if(x>0){
            if(x==y && z!=2) {
                System.out.print(x+" ");
                return dongu(x-5,y,z);
            }
            else if(x==y && z==2){
                System.out.print(x+" ");
                return 1;
            }
            else{
                if(z==1){
                System.out.print(x+" ");
                return dongu(x-5,y,z);
            }
                else{
                    System.out.print(x+" ");
                    return dongu(x+5,y,z);
                }
            }
            }
        else{
            System.out.print(x+" ");
            return dongu(x+5,y,z+1);
        }
        }




    public static void main(String args[]) {
        int sayi,sayi2,sayac=1;
        Scanner scanner =new Scanner(System.in);
        System.out.println("sayi:");
        sayi= scanner.nextInt();
        sayi2=sayi;
        dongu(sayi,sayi2,sayac);




    }

}
