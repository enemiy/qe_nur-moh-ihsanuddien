public class Exponentiation {
    private static int pangkat (int a, int b){
        int hasil =a;
        for(int i = 1 ;i< b;i++){
            hasil=hasil * a;
        }
    return hasil;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));

    }

}
