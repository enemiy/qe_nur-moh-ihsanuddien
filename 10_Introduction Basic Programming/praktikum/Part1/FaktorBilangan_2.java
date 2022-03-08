import java.util.Scanner;

public class FaktorBilangan_2 {
    public static void main(String[] args){
        int bilangan;
        Scanner s = new Scanner(System.in);

        bilangan =s.nextInt();
        int i;
        for(i=bilangan;i>0;i--){
            if (bilangan % i ==0 ){
                System.out.println(i);
            }
        }
    }

}

