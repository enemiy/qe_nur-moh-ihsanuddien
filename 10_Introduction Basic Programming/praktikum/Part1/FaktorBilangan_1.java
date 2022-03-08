import java.util.Scanner;

public class FaktorBilangan_1 {
    public static void main(String[] args){
        int bilangan;
        Scanner s = new Scanner(System.in);

        bilangan =s.nextInt();
        int i;
        for(i=1;i<=bilangan;i++){
            if (bilangan % i ==0 ){
                System.out.println(i);
            }
        }
    }

}
