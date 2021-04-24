package classes;
import java.lang.*;

public abstract class Receptionist extends Employee {
    public double Salary;

    public Receptionist(String ID, String Name, String DOB, String Gender, String Location, String bloodGroup, String Address, String Phone) {
        super(ID, Name, DOB, Gender, Location, bloodGroup, Address, Phone);
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void showPersonInf(){
        this.ID = ID;
        this.Name = Name;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Location = Location;
        this.bloodGroup = bloodGroup;
        this.Address = Address;
        this.Phone = Phone;
        this.Salary = Salary;
    }


}
