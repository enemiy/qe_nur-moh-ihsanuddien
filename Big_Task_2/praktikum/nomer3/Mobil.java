import java.util.ArrayList;

public class Mobil {
    protected int kapasitas;
    protected ArrayList<Integer> muatan = new ArrayList<>();

    public void mobil(int kap){
        this.kapasitas=kap;
    }

    public void tambahMuatan(int n){
        int sum = 0,temp_sum=0;
        for (int i: muatan) {
            sum += i;
        }
    
        temp_sum=n+sum;

        if(temp_sum<=kapasitas){
            muatan.add(n);
            sum=temp_sum;
            System.out.println("Hewan dengan berat : "+ n +" berhasil dimasukkan ke mobil");
            System.out.println("List Muatan didalam mobil sekarang : "+ muatan);
            System.out.println("Isi didalam mobil Sekarang : "+ sum);
        System.out.println("");}
        else{
            System.out.println("kapasitas melebihi batas,gagal menambahkan hewan dengan berat " +n);
           }




    }


        //sum total muatan
        //temp_muatan = muatan + value
        //if (temp_muatan<=kapasitas)
        //muatan.add(value)
        //kapasitas = temp muatan;
        //else
        // muatan penuh


}
