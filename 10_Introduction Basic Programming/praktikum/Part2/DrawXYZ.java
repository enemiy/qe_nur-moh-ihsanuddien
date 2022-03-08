public class DrawXYZ {
    private static void DrawXYZ (int n){
     int angka = n;
        for (int i=1;i<=n;i++){
         for (int j=1;j<=n;j++){
             if (angka %3 ==0){
                 System.out.print("X ");
             }
             else if (angka %2 ==0){
                 System.out.print("Z ");
             }
             else {
                 System.out.print("Y ");
             }
             angka--;
         }
         System.out.println("");

     }
        System.out.println("");
    }

    public static void main(String[] args) {
        DrawXYZ(3);
        DrawXYZ(5);
        DrawXYZ(1);
    }
}
