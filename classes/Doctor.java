package classes;
import java.lang.*;

public abstract class Doctor extends Person {
    private String Salary;
    public String Schedule;

    public Doctor(String ID, String Name, String DOB, String Gender, String Location, String bloodGroup, String Address, String Phone) {
        super(ID, Name, DOB, Gender, Location, bloodGroup, Address, Phone);
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void showPersonInf(){
        System.out.println("==== Doctor Info's ====\n");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name );
        System.out.println("Schedule: " + this.Schedule);
        System.out.println("Phone: " + this.Phone);
        System.out.println("Salary: " + this.Salary);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Gender: " + this.Gender);
        System.out.println("Location: " + this.Location);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Address: " + this.Address);
    }


}
