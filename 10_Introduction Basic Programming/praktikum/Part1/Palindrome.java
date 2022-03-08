public class Palindrome {
    private static  boolean palindrome (String value){
        boolean flag = true;

        for (int i = 0 ; i < value.length();i++){
                if (value.charAt(i) != value.charAt(value.length()-i-1)){
                    flag = false;
                    break;
                }
            }
        return flag;

        }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
    }

