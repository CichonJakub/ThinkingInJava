public class C3E6 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        Dog spot2 = spot;

        System.out.println(spot == scruffy);
        System.out.println(spot.equals(scruffy));

        System.out.println(spot == spot2);
        System.out.println(spot.equals(spot2));


//        spot.setName("Spotty");
//        spot.setSays("Hau");
//
//        scruffy.setName("Wolfy");
//        scruffy.setSays("Wrrrrr!");
//
//        spot.introduce();
//        spot.speek();
//
//        scruffy.introduce();
//        scruffy.speek();
    }
}
