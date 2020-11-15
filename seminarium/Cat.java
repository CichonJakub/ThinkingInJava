public class Cat {
    public String imie;
    public void czytajImie(){
        System.out.print("1");
        try{
            System.out.print("2");
            int x = Integer.parseInt(imie);
            System.out.print("3");
        }   catch (NumberFormatException e){
            System.out.print("4");
        }
    }
    public static void main(String[] args) {
        Cat kot = new Cat();
        kot.imie = "koteczek";
        kot.czytajImie();
        System.out.print("5");
    }
}
