public class C4E7 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1; i < 200; i++){
            System.out.println(i);
            counter++;
            if(i == 99)
                break;
        }
        System.out.println("there is " + counter + " numbers");
    }
}
