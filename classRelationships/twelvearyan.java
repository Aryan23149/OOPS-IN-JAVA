// Create a Student class with fields like name and grade.
// Create a GradingService class with a method that takes a Student object and prints a statement based on their grade.
// Implement a dependency where GradingService uses Student in a temporary relationship 
// to determine if the student has passed or failed.

class Student{
    String name;
    int grade;
    Student(String name,int grade){
        this.name=name;
        this.grade=grade;
    }
    int getgrade(){
        return this.grade;
    }
}
class GradingService{
    void checkresult(Student s){
        if(s.getgrade()>5){
            System.out.println("STUDENT HAS PASSED");
        }
        else{
            System.out.println("STUDENT HAS FAILED");
        }
    }
}
public class twelvearyan {
    public static void main(String[] args) {
        Student x=new Student("ARYAN", 8);
        GradingService y=new GradingService();
        y.checkresult(x);
    }
}