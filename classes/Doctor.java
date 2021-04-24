package classes;
import java.lang.*;

public abstract class Doctor extends Person {
    public String Salary;
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
        this.ID = ID;
        this.Name = Name;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Location = Location;
        this.bloodGroup = bloodGroup;
        this.Address = Address;
        this.Phone = Phone;
    }


}
