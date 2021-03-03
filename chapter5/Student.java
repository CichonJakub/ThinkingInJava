public class Student {
    String name;
    int grade;

    Student(String s, int i){
        name = s;
        grade = i;
        System.out.println("Hello I'm new student: " + name + " in the " + grade + " grade");
    }

    Student(){
        this("Jack", 1);
        System.out.println("Default student created");
    }
}
