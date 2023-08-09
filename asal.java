public class asal {
   public static void main(String[] args) {
       int sayac1;
       int i;
       System.out.print("2 ");
      for( i=3;i<101;i++){
          sayac1=0;
          for(int j=2;j<i;j++){
              if(i%j==0){
                  sayac1=1;
                  break;
              }
          }
          if(sayac1==0){
              System.out.print(i+" ");
          }
      }


    }
}
