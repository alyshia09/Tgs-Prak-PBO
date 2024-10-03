public class Main {
   public static void main(String[] args) {
       Spider labalaba = new Spider();
       labalaba.walk();
       labalaba.eat();

       Cat shadow = new Cat();
       shadow.setName("Shadow");
       System.out.println("nama kucing :Shadow");
       shadow.play();
       shadow.eat();

       Dog hailey = new Dog();
       hailey.setName("Hailey");
       System.out.println("nama anjing :Hailey");
       hailey.play();
       hailey.eat();
       hailey.walk();
   }

}
