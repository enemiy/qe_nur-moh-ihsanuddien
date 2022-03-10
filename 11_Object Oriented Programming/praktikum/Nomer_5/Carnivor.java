public class Carnivor extends Animals {

    public void Carnivor (String nama){
        this.nama=nama;
        this.jenisMakanan="Tumbuhan";
        this.gigiBinatang="Tumpul";
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi I'm Carnivore , My Name is " + nama + ", My Food is " + jenisMakanan + ", I have "+gigiBinatang+" teeth");
    }
}
