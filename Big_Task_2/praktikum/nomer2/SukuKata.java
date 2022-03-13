import java.util.Scanner;

public class SukuKata {

    public static void konversiSukuKata(String kalimat) {
        String convert = "";
        for (int i = 0; i < kalimat.length(); i++) {
            //Huruf O
            if (kalimat.charAt(i) == 111 || kalimat.charAt(i) == 79)
                convert += "-";
                //Huruf A
            else if (kalimat.charAt(i) == 65 || kalimat.charAt(i) == 97)
                convert += ".";
                //Huruf I
            else if (kalimat.charAt(i) == 69 || kalimat.charAt(i) == 101)
                convert += ".";
                //Huruf U
            else if (kalimat.charAt(i) == 73 || kalimat.charAt(i) == 105)
                convert += ".";
                //Huruf E
            else if (kalimat.charAt(i) == 85 || kalimat.charAt(i) == 117)
                convert += ".";
        }
        System.out.println(convert);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        konversiSukuKata(string);
    }
}
