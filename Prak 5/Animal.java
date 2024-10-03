abstract class Animal {
    protected  int legs;
    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("laba laba dengan " +legs+ "kaki sedang berjalan");

    }

    public void play() {
        System.out.println("sedang bermain");
    }
    

    public abstract void eat();
}
