public class C4E6 {
    static int check(int var, int begin, int end){
        // condition in case of wrong range ( begin > end )
        if(begin > end){
            int temp = begin;
            begin = end;
            end = temp;
            //System.out.println(" begin " + begin + " end " + end);
        }

        if(var >= begin && var <= end) {
            System.out.println(" begin " + begin + " end " + end);
            return 1; // var  inside given range
        }
        else{
            System.out.println(" begin " + begin + " end " + end);
            return 0;// var outside given range
        }

    }

    public static void main(String[] args) {
//        System.out.println(check(5, 1, 7));
//        System.out.println(check(12, 13, 144));
        System.out.println(check(17, 30, 15));
    }

}
