
public class Shipping {
    protected static final int  harga = 5000 ;

    public static void main(String[] args) {

        CostShipping ShippingCost = new CostShipping();
        ShippingCost.costShipping(5 , 2 , 4 , 1);
        double harga = ShippingCost.calculateCost();
        System.out.println("panjang : " + ShippingCost.panjang);
        System.out.println("lebar : " + ShippingCost.lebar);
        System.out.println("tinggi : " + ShippingCost.tinggi);
        System.out.println("berat : " + ShippingCost.berat);
        System.out.println("");
        System.out.println("Harga: "+ harga);
    }

}
