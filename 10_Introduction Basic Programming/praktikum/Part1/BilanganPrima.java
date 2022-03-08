public class BilanganPrima {
    private static  boolean primeNumber (int number){
        boolean flag = true;
        for (int i =2 ;i<number;i++){
            if (number%i == 0){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));

    }

}
