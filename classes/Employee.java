package classes;
import java.lang.*;

public abstract class Employee extends Person {
    public double Salary;

    public Employee(String ID, String Name, String DOB, String Gender, String Location, String bloodGroup, String Address, String Phone) {
        super(ID, Name, DOB, Gender, Location, bloodGroup, Address, Phone);
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

}