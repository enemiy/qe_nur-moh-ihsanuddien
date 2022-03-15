import java.util.ArrayList;
import java.util.List;
public class ArrayMerge {
    public static void main(String[] args) {
        String[] array1= {"kazuya","jin","lee"};
        String[] array2={"kazuya","feng"};
        List<String> array3 = new ArrayList<>();
        for (int i =0;i< array1.length;i++) {

            if (array3.contains(array1[i]) == true){
                continue;}
            else{
                array3.add(array1[i]);}
        }
        for (int j=0;j< array2.length;j++){
            if (array3.contains(array2[j])==true){
                    continue;}
            else{
                array3.add(array2[j]);}
        }
        for (String str : array3) {
        System.out.println(str);
       }
    }
}
