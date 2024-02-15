import java.util.Scanner;

public class matris {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("matrix kaç satır olacak:");
        int satir=scanner.nextInt();
        System.out.println("matrix kaç sutün olacak:");
        int sutun=scanner.nextInt();
        int[][] dizi=new int[satir][sutun];
        System.out.println("matris değerlerini giriniz:");
        for(int i=0;i< satir;i++){
            for (int j=0;j<sutun;j++){
                dizi[i][j]=scanner.nextInt();
            }
        }


        int[][] transpoz=new int[dizi[0].length][dizi.length];


        for(int i=0;i< dizi[0].length;i++){
            for (int j=0;j<dizi.length;j++){
                transpoz[i][j]=dizi[j][i];
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i< dizi.length;i++){
            for (int j=0;j<dizi[0].length;j++){
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nTranspoz:");
        for(int i=0;i< dizi[0].length;i++){
            for (int j=0;j<dizi.length;j++){
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println();
        }



    }
}
