public class Cw11 {
    //using AllColoursOfRainbow
    public static void main(String[] args) {
        AllColoursOfrainbow rainbow = new AllColoursOfrainbow();
        System.out.println("present color: " + rainbow.presentColorInt);
        rainbow.changeColor(9);
        System.out.println("new present color: " + rainbow.presentColorInt);

        System.out.println("present color hue: " + rainbow.hue);
        rainbow.changeHue(12);
        System.out.println("new present color hue: " + rainbow.hue);
    }
}
