public class Test { // zad 2
    public static void main(String[] args) {
        boolean kontynuuj = true;
        int licz = 0;
        int x = 3;
        while(licz++ < 3){
            int y = (1 + 2 * licz) % 3;
            switch(y){
                default:
                case 0: x -= 1;
                        System.out.println("zaraz bedzie y: " + y);
                        System.out.println("zaraz x teraz: " + x);
                        break;
                case 1: x += 5;
                        System.out.println("y: " + y);
                        System.out.println("x: " + x);

            }
        }
        System.out.println(x);
    }
}
