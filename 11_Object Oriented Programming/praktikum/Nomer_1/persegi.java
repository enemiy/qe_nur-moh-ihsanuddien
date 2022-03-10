public class persegi extends LuasKeliling {
    private int sisi;
     public void persegi(int sisi){
         this.sisi=sisi;
     }
     public int luas(){
         return sisi*sisi;
     }

     public int keliling(){
     return 4*sisi;
     }
}
