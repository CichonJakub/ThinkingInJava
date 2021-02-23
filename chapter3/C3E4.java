public class C3E4 {
    static double show_velocity(double distance, double time){
        if(time == 0){
            return 0;
        }
        else{
            return distance/time;
        }
    }

    public static void main(String[] args) {
        double time = 3.123;
        double distance = 57.23125;
        System.out.println("Calculated velocity: ");
        System.out.println(show_velocity(distance, time));
    }
}
