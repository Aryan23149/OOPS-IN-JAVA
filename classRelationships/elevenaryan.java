// Exercise: Association Implementation
// Task
// Create a Doctor class with an attribute name and a method seePatient() that prints that the doctor is seeing a patient.
// Create a Patient class with an attribute name and a method describeCondition() that describes the patient’s condition.
// Create an Appointment class where a Doctor is associated with a Patient. The class should have methods:
// scheduleAppointment() to assign a doctor to a patient for an appointment.
// startAppointment() to have the doctor see the patient and the patient describe their condition.
// In the main method, create a doctor, a patient, and an appointment, then schedule and start the appointment.
class Doctor{
    private String Name;
    private boolean isfree;
    public Doctor(){
        this.Name="";
        this.isfree=true;
    }
    public Doctor(String Name){
        this.Name=Name;
        this.isfree=true;
    }
    String getName(){
        return this.Name;
    }
    void seePatient(){
        if(this.isfree==false){
            System.out.println("DOCTOR "+this.Name+" IS SEEING A PATIENT");
        }
        else{
            System.out.println("DOCTOR IS FREE");
        }
    }
    void changeIsFree(){
        this.isfree=!this.isfree;
    }
}
class Patient{
    private String name;
    private String diseaseName;
    private boolean gotAppointment;
    public Patient(){
        this.name="";
        this.diseaseName="";
        this.gotAppointment=false;

    }
    public Patient(String name,String diseaseName) {
        this.name=name;
        this.diseaseName=diseaseName;
        this.gotAppointment=false;
    }
    String getName(){
        return this.name;
    }
    void changegotAppointment(){
        this.gotAppointment=!this.gotAppointment;
    }
    void describeCondition(){
        System.out.println("\nPatient's Name is:  "+this.name+"\nPatient is suffering from" +this.diseaseName);
        // if(this.gotAppointment==true){
        //     System.out.println("Patient has got an appointment with a doctor");
        // }
        // else{
        //     System.out.println("Patient has not got an appointment yet");
        // }
    }
}
class appointment{
    Doctor doc;
    Patient pat;
    public appointment() {
        this.doc=new Doctor();
        this.pat=new Patient();
    }
    void scheduleAppointment(Doctor d,Patient p){
        d.changeIsFree();
        p.changegotAppointment();
        this.doc=d;
        this.pat=p;
        System.out.println("\n\nDoctor "+this.doc.getName()+" Will meet The Patient "+this.pat.getName()+" \n\n");

    }
    void startAppointment(){
        System.out.println("\n\nDoctor is listening to what Patient has to describe while Patient is Explaining his condition as follows: \n\n");
        this.pat.describeCondition();
    }
    void endAppointment(){
        this.doc.changeIsFree();
        this.pat.changegotAppointment();
        System.out.println("\nAppointment has been finished\n");
    }
}
public class elevenaryan{
    public static void main(String[] args) {
        Doctor Aman=new Doctor("Aman");
        Patient kane=new Patient("KL","Fever");
        appointment one=new appointment();
        one.scheduleAppointment(Aman, kane);
        one.startAppointment();
        one.endAppointment();
    }
}
