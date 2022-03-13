import java.util.Scanner;

public class IndexHuruf {

    public static void indexHuruf(String huruf) {
        String[][] TabelHuruf = {
                {"A", "B", "CK", "D", "E"},
                {"F", "G", "H", "I", "J"},
                {"L", "M", "N", "O", "P"},
                {"Q", "R", "S", "T", "U"},
                {"V", "W", "X", "Y", "Z"}
        };

        boolean flag=false;
        for (int i = 0; i < TabelHuruf.length; i++) {
            for (int j = 0; j < TabelHuruf[i].length; j++) {
                if (TabelHuruf[i][j].contains(huruf)) {
                    System.out.println((j+1) + " " + (i+1));
                    flag=true;
                }
            }

        }if (flag==false){
            System.out.println("Tidak Ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Cari Index Huruf : ");
        String huruf =sc.nextLine();
        indexHuruf(huruf);


    }
}
