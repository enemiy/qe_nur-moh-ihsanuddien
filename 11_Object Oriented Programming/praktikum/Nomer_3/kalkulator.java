public class kalkulator {
    protected int angka1;
    protected int angka2;

    public static void main(String[] args) {
        //INPUT
        pertambahan penjumlahan = new pertambahan();
        penjumlahan.pertambahan(3,4);

        pengurangan pengurangan = new pengurangan();
        pengurangan.pengurangan(15,4);

        perkalian perkalian = new perkalian();
        perkalian.perkalian(10,10);

        pembagian pembagian = new pembagian();
        pembagian.pembagian(12,3);

        //OUTPUT

        System.out.println("Penjumlahan : " + penjumlahan.tambah()) ;
        System.out.println("Pengurangan : " + pengurangan.kurang());
        System.out.println("Perkalian : " + perkalian.kali());
        System.out.println("Pembagian : " + pembagian.bagi());

    }


}
