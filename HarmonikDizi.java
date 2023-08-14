public class HarmonikDizi {

    public static void main(String args[]) {

        int[] numbers = {1, 2, 3, 4, 5};
        double sonuc=0.0;

        for(double i=1;i<= numbers.length;i++){
            sonuc=sonuc+(1/i);
        }

        System.out.println(numbers.length/sonuc);
    }

}
