
public class volume {

    public static void main(String[] args) {

        kubus kubus = new kubus();
        kubus.kubus(10);

        balok balok = new balok();
        balok.balok(3,6,10);

        tabung tabung = new tabung();
        tabung.tabung(7,10);

        System.out.println("VOLUME");
        System.out.println("Kubus : " + kubus.volume() );
        System.out.println("Balok : " + balok.volume() );
        System.out.println("Tabung : " + tabung.volume());
        System.out.println("");

    }
}
