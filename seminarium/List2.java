import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("abc");
        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("abc");
        if(l1 == l2)
            System.out.println("A");
        else if (l1.equals(l2))
            System.out.println("B");
        else
            System.out.println("C");

    }



}
