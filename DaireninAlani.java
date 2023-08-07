import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        int yariCap,merkezAci;
        Scanner scanner=new Scanner(System.in);
        System.out.println("yari çap:");
        yariCap= scanner.nextInt();
        System.out.println("merkez açı:");
        merkezAci= scanner.nextInt();
        double pi=3.14;
        double alan=(pi*yariCap*yariCap*merkezAci)/360;
        System.out.println("alan:"+alan);
    }
}
