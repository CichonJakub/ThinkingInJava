public class C4E4 {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++){
            if(i == 1)
                System.out.println(i);
            else{
                int counter = 0;
                for(int k = 1; k <= i; k++){
                    if(i % k == 0)
                        counter++;
                }
                if(counter == 2){
                    System.out.println(i);
                }
            }
        }
    }
}
