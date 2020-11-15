public class Strings_2 { // zad 9
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(5, "ccc");
        System.out.println(sb);
    }
}
