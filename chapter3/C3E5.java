public class C3E5 { // using  class Dog
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.setName("Spotty");
        spot.setSays("Hau");

        scruffy.setName("Wolfy");
        scruffy.setSays("Wrrrrr!");

        spot.introduce();
        spot.speek();

        scruffy.introduce();
        scruffy.speek();
    }
}
