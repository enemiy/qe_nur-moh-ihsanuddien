public class CostShipping extends Shipping{
 protected double panjang,lebar,tinggi;
 protected double berat,hargaVolume,hargaBerat ;

 public void costShipping (double panjang, double lebar, double tinggi, double berat){
     this.panjang = panjang;
     this.lebar = lebar;
     this.tinggi = tinggi;
     this.berat = berat;
 }

 public double calculateCost(){
     double hargaPaket;
     double volume = panjang*lebar*tinggi;
     if (volume <=50 && berat <=1 ) {
         hargaPaket = harga;
         return hargaPaket;
     }
     else {
         double volumeperharga = Math.ceil(volume/50);
         hargaBerat = harga*berat;
         hargaVolume = harga*volumeperharga;
         if (hargaVolume> hargaBerat){
             return hargaVolume;
         }
         else if (hargaVolume< hargaBerat){
             return hargaBerat;
         }
        else{
                return hargaVolume;
         }}}
}
