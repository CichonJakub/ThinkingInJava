public class Cw4 {
    public static void main(String[] args) {
        class Data_Only{
            int i;
            double d;
            boolean b;
            void show_values(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        Data_Only d = new Data_Only();
        d.i = 31;
        d.d = 31.32234;
        d.b = true;

        d.show_values();
    }
}
