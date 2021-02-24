public class C4E9 {
    //calculating n-th value
    static int fibb(int range){
        if(range < 2)
            return 1;
        else{
            return fibb(range - 2) + fibb(range - 1); //recursive, other way is dynamic arrays
        }
    }
    //functon presenting n-long fibb function
    static void fibb_full(int n){
        for(int i = 0; i < n; i++){
            System.out.print(" " + fibb(i) + " ");
        }
    }

    public static void main(String[] args) {
        fibb_full(10);
    }
}
