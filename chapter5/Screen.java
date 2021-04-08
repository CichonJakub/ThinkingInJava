public class Screen {
     double width;
     double hight;
     double inch;

     Screen(double w, double h, double i){
         width = w;
         hight = h;
         inch = i;
     }

     double get_size(){
         double size;
         size = Math.sqrt((Math.pow(width, 2) + Math.pow(hight, 2)));
         return  size;
     }


     double get_height(){
         double var;
         double inch2;
         //inch2 = inch / 0.393700787;
         inch2 = inch;
         var = Math.sqrt((Math.pow(inch2, 2) - Math.pow(width, 2)));
         return var;
     }




}
