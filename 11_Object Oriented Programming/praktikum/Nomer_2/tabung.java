public class tabung extends volume {
    private int radius,tinggi;
    public void tabung(int radius,int tinggi){
        this.radius=radius;
        this.tinggi=tinggi;
    }

    public int volume(){
        return (int)(Math.ceil(Math.PI*radius*radius*tinggi));
    }

}