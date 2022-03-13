import java.util.Scanner;
public class JamPasir {
    private static void playWithAsterisk (int n){
        int s,i,j;

        for(i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++ )
            {
                System.out.print(" ");
            }

            for (s=n; s>=i; s--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (i=2; i<=n; i++)
        {
            for (s=i; s<n; s++)
            {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++ )
            {
                System.out.print(" *");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = sc.nextInt();

        playWithAsterisk(angka);
    }
}
