public class Omnivor extends Animals{
    public void Omnivor (String nama){
        this.nama=nama;
        this.jenisMakanan="Semua";
        this.gigiBinatang="Tajam dan Tumpul";
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi I'm Omnivore , My Name is " + nama + ", My Food is " + jenisMakanan + ", I have "+gigiBinatang+" teeth");
    }
}

