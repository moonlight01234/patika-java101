public class bharfi {
    public static void main(String[] args) {
        String[][] letter = new String[3][3];
        String[][] letter2 = new String[4][4];
        for(int i=0;i<3;i=i+2){
            for(int j=0;j<3;j++){
                letter[i][j]=" * ";
                letter[j][i]=" * ";

            }
        }
        for(int i=1;i<2;i++){
            for(int j=1;j<2;j++){
                letter[i][j]="   ";
            }
        }
        for(int i=0;i<4;i=i+3){
            for(int j=0;j<4;j++){
                letter2[i][j]=" * ";
                letter2[j][i]=" * ";
            }
        }
        for(int i=1;i<3;i++){
            for(int j=1;j<3;j++){
                letter2[i][j]="   ";
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        for (String[] row : letter2){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
