public class Cw7 { // needs StaticTest & Incrementable

    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable inc = new Incrementable();


        inc.increment();
        System.out.println("After incrementation: inc.increment() ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);


        Incrementable.increment();
        System.out.println("After incrementation: Incrementable.increment() ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("StaticTest.i= " + StaticTest.i);

    }
}
