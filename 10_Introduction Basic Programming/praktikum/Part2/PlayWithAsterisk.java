public class PlayWithAsterisk {
    private static void playWithAsterisk (int n){
        int s,i,j;

        for (i=1; i<=n; i++)
        {
            for (s=i; s<n; s++)
            {
                // printing spaces
                System.out.print(" ");
            }

            // inner loop to handle number of columns

            for (j=1; j<=i; j++ )
            {
                System.out.print("* ");
            }

            System.out.println();
        }
            }

    public static void main(String[] args) {
        playWithAsterisk(5);
    }

}
