public class Tables_fun {


    public static void main(String[] args) {

        int[] a = new int[5];




        for(int i=0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                a[j] += 1;
            }

            System.out.println("thats a " + i + " value : " + a[i]);
        }
    }


}
