public class Words {

    static String word1 = "hi";
    static String word2, word3;
    static{
        word2 = "welcome fellow man";
        word3 = "nice to have you here";
    }

    static void speak(){
        System.out.println(word1 + " " + word2 + " " + word3);
    }
    Words(){
        System.out.println("Giving a speech!");
    }





}
