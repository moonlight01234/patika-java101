import java.util.*;

public class frekans {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dizi değerlerini giriniz:");
        ArrayList<Integer> dizi=new ArrayList<Integer>();
        ArrayList<Integer> sonuc=new ArrayList<>();
        int deger;

        while(true)
        {
            deger=scanner.nextInt();
            if(deger==-1)
            {
            break;
            }
            dizi.add(deger);

        }
        int sayac=0;
        Collections.sort(dizi);
        for(int i=0;i<dizi.size();i++){
            System.out.println(dizi.get(i));
        }

        int i=0;
        int j;
        while(i<dizi.size()){
            j=i;
            while(j<dizi.size()){
                if(dizi.get(i)==dizi.get(j)){
                    sayac++;

                }
                else
                {
                    sonuc.add(dizi.get(i));
                    sonuc.add(sayac);
                    sayac=0;
                    break;
                }
                j=j+1;
            }
            i=j;
        }

        sonuc.add(dizi.get(dizi.size() - 1));
        sonuc.add(sayac);


        for(int z=0;z<sonuc.size();z=z+2){
            System.out.println(sonuc.get(z) +" değerinden "+sonuc.get(z+1)+" kez var");
        }


    }
}
