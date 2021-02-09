public class Cw6 {
    public static void main(String[] args) {
        class Amount{
            int amount(String s){
                return s.length() * 2;
            }
        }
        Amount a = new Amount();
        System.out.println(a.amount("hello Mr. Holmes"));
    }
}
