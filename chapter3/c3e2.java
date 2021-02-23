public class c3e2 {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car opel = new Car();

        bmw.fuel = 2.111f; //interpreted as double so need to add f
        opel.fuel = 1.777f;

        System.out.println("BMW fuel: " + bmw.fuel + " Opel fuel: " + opel.fuel);

        //changing references to objects aka aliasing

        bmw = opel;
        System.out.println("New values, BMW fuel: " + bmw.fuel + " Opel fuel: " + opel.fuel);

    }


}
