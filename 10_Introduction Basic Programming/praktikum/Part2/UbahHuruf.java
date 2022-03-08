public class UbahHuruf {
    private static String ubahHuruf (String s){
        s= s.toUpperCase();
        String enkrip = "";
        for(int i = 0 ; i<s.length();i++){
            if (s.charAt(i)== 32){
                enkrip+= " ";
            }
            else {
                char huruf = (char) (s.charAt(i) + 10);
                if (huruf > 'Z') {
                    enkrip += (char) (s.charAt(i) - (26 - 10));
                } else {
                    enkrip += (char) (s.charAt(i) + 10);
                }
            }

        }
        return enkrip;
    }

    public static void main(String[] args) {
      System.out.println(ubahHuruf("SEPULSA OKE"));
      System.out.println(ubahHuruf("ALTERRA ACADEMY"));
      System.out.println(ubahHuruf("INDONESIA"));
      System.out.println(ubahHuruf("GOLANG"));
      System.out.println(ubahHuruf("PROGRAMMER"));
    }
}
