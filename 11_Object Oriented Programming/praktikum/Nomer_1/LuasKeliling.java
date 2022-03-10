
public class LuasKeliling {

    public static void main(String[] args) {

    persegi persegi = new persegi();
    persegi.persegi(4);

    segitiga segitiga = new segitiga();
    segitiga.segitiga(3,4);

    persegiPanjang persegiPanjang = new persegiPanjang();
    persegiPanjang.persegiPanjang(7,8);

    System.out.println("LUAS");
    System.out.println("Persegi : " + persegi.luas() );
    System.out.println("Segitiga : " + segitiga.luas() );
    System.out.println("Persegi Panjang : " + persegiPanjang.luas());
    System.out.println("");
    System.out.println("KELILING");
    System.out.println("Persegi : " + persegi.keliling());
    System.out.println("Segitiga : " + segitiga.keliling());
    System.out.println("Persegi panjang : " + persegiPanjang.keliling());

    }
}

