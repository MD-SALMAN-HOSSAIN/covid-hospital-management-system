package classes;
import java.lang.*;

public abstract class Nurse extends Employee{
    public double Salary;

    public Nurse(String ID, String Name, String DOB, String Gender, String Location, String bloodGroup, String Address, String Phone) {
        super(ID, Name, DOB, Gender, Location, bloodGroup, Address, Phone);
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void showPersonInf(){
        System.out.println("==== Nurse Info's ====\n");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name );
        System.out.println("Phone: " + this.Phone);
        System.out.println("Salary: " + this.Salary);
        System.out.println("DOB: " + this.DOB);
        System.out.println("Gender: " + this.Gender);
        System.out.println("Location: " + this.Location);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Address: " + this.Address);
    }


}
