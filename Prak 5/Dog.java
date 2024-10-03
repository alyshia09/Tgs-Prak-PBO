public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("Hailey main tangkap bola");
    }

    @Override
    public void eat() {
        System.out.println("Hailey Memakan daging");
    }

    @Override
    public void walk() {
        System.out.println("Hailey Jalan mengitari taman");
    }
}
