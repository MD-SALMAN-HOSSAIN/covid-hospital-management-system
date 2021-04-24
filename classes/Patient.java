package classes;
import java.lang.*;

public abstract class Patient extends Person {
    public String Status;
    public double Fees;

    public Patient(String ID, String Name, String DOB, String Gender, String Location, String bloodGroup, String Address, String Phone) {
        super(ID, Name, DOB, Gender, Location, bloodGroup, Address, Phone);
    }

    public void Patient(){

    }

    public void setStatus(String Status){
        this.Status = Status;
    }

    public String getStatus(){
        return Status;
    }

    public void setFees(double Fees){
        this.Fees = Fees;
    }

    public double getFees(){
        return Fees;
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
        this.Fees = Fees;
        this.Status = Status;
    }

}
