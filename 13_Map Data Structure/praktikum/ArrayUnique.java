public class ArrayUnique {
    static void angkaunik(int a[], int b[]) {
        int i,j;
        int panjang_a = a.length;
        int panjang_b = b.length;
        for (i = 0; i < panjang_a; i++)
        {
            for (j = 0; j < panjang_b; j++)
                if (a[i] == b[j])
                    break;

            if (j == panjang_b)
                System.out.print(a[i] + " ");

        }
        System.out.println(" ");
    }

    public static void main(String[] args)
    {
        int a[] = { 1,2,3,4 };
        int b[] = { 1,3,5,10,16 };

        angkaunik(a, b);

        int c[] = { 3,8 };
        int d[] = { 2,8 };

        angkaunik(c, d);
    }
}