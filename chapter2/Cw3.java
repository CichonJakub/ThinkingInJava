import java.sql.SQLOutput;

public class Cw3 {
    public static void main(String[] args) {
        class Data{
            int i;
            double d;
            boolean b;
            void show_values(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        Data d = new Data();
        d.i = 31;
        d.d = 31.32234;
        d.b = true;

        d.show_values();
    }
}
