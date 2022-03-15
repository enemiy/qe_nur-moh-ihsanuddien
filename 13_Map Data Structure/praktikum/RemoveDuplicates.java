public class RemoveDuplicates {
        public static int removeDuplicates(int[] angka) {

            int hitung = 0;
            for (int i = 0; i < angka.length; i++) {

                if (i < angka.length - 1 && angka[i] == angka[i + 1]) {
                    continue;
                }
                angka[hitung] = angka[i];
                hitung++;
            }
            return hitung;
        }

        public static void main(String[] args) {
            System.out.println(removeDuplicates(new int[]{2, 3, 3, 3, 6, 9, 9}));
            System.out.println(removeDuplicates(new int[]{2, 2, 2,11}));
        }
}
