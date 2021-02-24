import java.util.Random;

public class C3E7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);
        System.out.println(i);
        if(i % 2 == 0)
            System.out.println("Your Coin is Eagle up");
        else System.out.println("Your Coin is Value up");
    }

}
