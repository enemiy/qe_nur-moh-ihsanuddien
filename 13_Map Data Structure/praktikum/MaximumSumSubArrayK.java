public class MaximumSumSubArrayK {
        public static int Sum(int array[], int k) {
            int sum_1 = 0;
            for (int i = 0; i < k; i++)
                sum_1 = sum_1 + array[i];
            int sum_2 = sum_1;
            for (int i = k; i < array.length; i++) {
                sum_2 = sum_2 + (array[i] - array[i - k]);
                sum_1 = Math.max(sum_1,sum_2);
            }
            return sum_1;
        }

        public static void main(String[] args)
        {
            int k = 3;
            int[] angka = {2,1,5,1,3,2};
            System.out.println(Sum(angka,k));

            k = 2;
            int[] angka2 = {2,3,4,1,5};
            System.out.println(Sum(angka,k));
        }
    }

