public class tekrarDizi {
    public static void main(String[] args) {
        int[] liste={1,2,3,4,5,6,7,8,9,2,4,5,7,8};
        for(int i=0;i<liste.length;i++){
            if(liste[i]%2==0){
                for(int j=i+1;j< liste.length;j++){
                    if(liste[i]==liste[j]){
                        System.out.println(liste[i]);
                    }
                }
            }
        }
    }
}
