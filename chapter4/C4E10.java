public class C4E10 {


    public static void main(String[] args) {

        for(int a = 1; a < 10; a++){
            for(int b = 0; b < 10; b++){
                for(int c = 0; c <10; c++){
                    for(int d = 0; d < 10; d++){
                        int value = 1000 * a + 100 * b + 10 * c + d; // 12 vays

                        if( c == 0 && d == 0)
                            continue;

                        if((10 * a + b) * (10 * c + d) == value) //1
                            System.out.println(value);
                        else if((10 * a + b) * (10 * d + c) == value) //2
                            System.out.println(value);
                        else if((10 * b + a) * (10 * c + d) == value) //3
                            System.out.println(value);
                        else if((10 * b + a) * (10 * d + c) == value) //4
                            System.out.println(value);
                        else if((10 * a + c) * (10 * b + d) == value) //5
                            System.out.println(value);
                        else if((10 * a + c) * (10 * d + b) == value) //6
                            System.out.println(value);
                        else if((10 * c + a) * (10 * b + d) == value) //7
                            System.out.println(value);
                        else if((10 * c + a) * (10 * d + b) == value) //8
                            System.out.println(value);
                        else if((10 * a + d) * (10 * c + b) == value) //9
                            System.out.println(value);
                        else if((10 * a + d) * (10 * b + c) == value) //10
                            System.out.println(value);
                        else if((10 * d + a) * (10 * c + b) == value) //11
                            System.out.println(value);
                        else if((10 * d + a) * (10 * b + c) == value) //12
                            System.out.println(value);


                    }
                }
            }
        }



    }


}
