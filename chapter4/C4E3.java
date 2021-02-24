import java.util.Random;

public class C4E3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int compare = rand.nextInt(50);
        System.out.println("Number used to compare is: " + compare);

        boolean fun = true;
        //infinite loop
        while(fun == true){
            int var = rand.nextInt(50);
            System.out.println("Our variable is: " + var);
            if(var < compare)
                System.out.println("var is smaller than compare");
            else if(var > compare)
                System.out.println("var is bigger than compare");
            else System.out.println("var is equal to compare");
        }
    }
}
