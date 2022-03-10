public class persegiPanjang extends LuasKeliling{
    private int lebar,panjang;
    public void persegiPanjang(int lebar,int panjang){
        this.lebar=lebar;
        this.panjang=panjang;
    }
    public int luas(){
        return lebar*panjang;
    }

    public int keliling(){
        return 2*(lebar+panjang);
    }
}
