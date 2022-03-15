import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

class AngkaMunculSekali {

    public static void main(String[] args)
    {
        String s = "76523752";
        List<Integer> listangka = new ArrayList<Integer>();
        List<Integer> tanpaDuplikat = new ArrayList<Integer>();
        CharacterIterator it = new StringCharacterIterator(s);
        while (it.current() != CharacterIterator.DONE)
        {
            int number = Character.getNumericValue(it.current());
            listangka.add(number);
            it.next();
        }
        for (int i=0;i < listangka.size() ; i++){
            int j;
            boolean flag=true;
            int n1= listangka.get(i);
            for ( j =0;j<listangka.size();j++){
                int n2= listangka.get(j);
                if (n1 == n2 && (i!=j)){
                    flag =true;
                    break;
                }
                else if(n1!=n2 && i!=j){
                    flag = false;
                }
                }

            if (flag== false){
               tanpaDuplikat.add(n1);
                }
        }
        System.out.println(tanpaDuplikat);
    }

}