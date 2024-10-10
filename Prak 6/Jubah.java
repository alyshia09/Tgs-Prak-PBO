public class Jubah {
    private String name;
    private int kekuatan;
    private int dayaBertahan;

    public Jubah(String name, int kekuatan, int health){
        this.name = name;
        this.kekuatan = kekuatan;
        this.dayaBertahan = dayaBertahan;
    }

    public int getPenambahanKesehatan(){
        return this.kekuatan*10 + this.dayaBertahan;
    }

    public String getName() {
        return this.name;
    }

    public int getDayaPertahanan(){
        return this.kekuatan*2;
    } 
} 
