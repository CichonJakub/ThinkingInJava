

public class Dog { // used for C3E5
    String name;
    String says;

    void setName(String newname){
        name = newname;
    }
    void setSays(String newvoide){
        says = newvoide;
    }

    void introduce(){
        System.out.println("My name is: " + name);
    }
    void speek(){
        System.out.println(says);
    }
}
