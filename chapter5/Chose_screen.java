

public class Chose_screen {

//    double cm_to_inch(double inch){
//        double cm = inch * 0.393700787;
//        return cm;
//    }

    public static void main(String[] args) {
        Screen predator = new Screen(61.4, 53, 27);
//        System.out.println(" cm: " + predator.get_size());
//
//        double cm = predator.get_size();
//        double inch = cm * 0.393700787;
//
//
//        System.out.println("inch: " + inch);

        System.out.println(predator.get_height());

        Screen old = new Screen(56.6 , 54.2 , 65);
        System.out.println("stary: ");
        System.out.println(old.get_height());
    }



}
