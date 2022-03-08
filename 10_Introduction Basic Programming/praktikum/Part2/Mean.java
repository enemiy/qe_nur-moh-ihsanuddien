public class Mean {
    private static float Mean(float[] numbers) {
        float length = numbers.length, sum = 0;
        for (int i = 0; i < length; i++)
            sum += numbers[i];
        float mean = sum/length;
        return mean;
    }



    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
}
