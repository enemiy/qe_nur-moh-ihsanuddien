public class Animals {
    protected String nama;
    protected String jenisMakanan;
    protected String gigiBinatang;

    public void identity_myself(){
        System.out.println("Hi I'm Parent of All ANimal, My Name is Binatang ");
    }
    public static void main(String[] args) {

        Animals animal = new Animals();
        animal.identity_myself();

        System.out.println("");

        Herbivor herbivore = new Herbivor();
        herbivore.Herbivor("Kambing");
        herbivore.identity_myself();

        Carnivor carnivore = new Carnivor();
        carnivore.Carnivor("Singa");
        carnivore.identity_myself();

        System.out.println("");

        Omnivor omnivore = new Omnivor();
        omnivore.Omnivor("Ayam");
        omnivore.identity_myself();
    }
}
