public class segitiga extends LuasKeliling {
    private int alas,tinggi;
    public void segitiga(int alas,int tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    public double luas(){
        return 0.5*alas*tinggi;
    }

    public int keliling(){
        int sisi = (int)Math.sqrt((alas*alas)+(tinggi*tinggi));
        return alas+tinggi+sisi;
    }


}