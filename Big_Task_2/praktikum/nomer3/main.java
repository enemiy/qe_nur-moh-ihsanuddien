public class main {
    public static void main(String[] args) {

        Hewan hewan = new Hewan();
        hewan.hewan(50);
        Hewan hewan2 = new Hewan();
        hewan2.hewan(30);
        Hewan hewan3 = new Hewan();
        hewan3.hewan(20);


        Mobil mobil = new Mobil();

        mobil.mobil(100);
        mobil.tambahMuatan(hewan.berat);
        mobil.tambahMuatan(hewan2.berat);
        mobil.tambahMuatan(hewan3.berat);

    }
}
