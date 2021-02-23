public class Comparing {
    public static void main(String[] args) {
        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);

        System.out.println("== showing if twi ints are the seame reference to object: ");
        System.out.println(i1 == i2);

        System.out.println("!= showing if two ints are two different references to objects ");
        System.out.println(i1 != i2);

        System.out.println("i1.equals(i2) checking if two ints have the same value");
        System.out.println(i1.equals(i2));


    }
}
