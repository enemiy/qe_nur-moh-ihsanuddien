public class kubus extends volume {
    private int sisi;
    public void kubus(int sisi){
        this.sisi=sisi;
    }

    public int volume(){
        return sisi*sisi*sisi;
    }

}
