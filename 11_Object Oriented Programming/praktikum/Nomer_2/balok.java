public class balok extends volume {
    private int panjang,lebar,tinggi;
    public void balok(int panjang,int lebar, int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }

    public int volume(){
        return panjang*lebar*tinggi;
    }

}
