// Create a School class that has a list of Teacher objects, representing aggregation.
// Implement a Teacher class independently with a name attribute and a displayInfo() method.
// In the School class, add methods to add teachers and display information about each teacher.
import java.util.ArrayList;
import java.util.Scanner;
class Teacher{
    private String Name;

    Teacher(String Name){
        this.Name=Name;
    }
    void displayInfo(){
        System.out.println("\nNAME OF THE TEACHER IS "+this.Name);
    }
}
class School{
    private String Name;
    private ArrayList<Teacher> AllTeachers;

    School(String Name){
        this.Name=Name;
        this.AllTeachers=new ArrayList<Teacher>();
    }
    void add(Teacher t){
        this.AllTeachers.add(t);
    }
    void displayInfo(){
        System.out.println("HERE ARE NAMES OF ALL THE TEACHERS of "+this.Name+" SCHOOL");

        for(Teacher i: AllTeachers){
            i.displayInfo();
        }
        System.out.println("\n\n");
    }
}
public class tenaryan{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("ENTER NAME OF THE SCHOOL: ");
        String school_name=input.nextLine();
        School x=new School(school_name);
        x.displayInfo();

        Teacher t1=new Teacher("Laxmi toma");
        Teacher t2=new Teacher("GOBA BOOM");
        x.add(t1);
        x.add(t2);
        x.displayInfo();

        input.close();
    }
}