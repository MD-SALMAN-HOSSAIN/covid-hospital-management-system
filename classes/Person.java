package classes;
import interfaces.*;

public abstract class Person implements PersonI {
    public String ID;
    public String Name;
    public String DOB;
    public String Gender;
    public String Location;
    public String bloodGroup;
    public String Address;
    public String Phone;

    public Person(String ID, String Name, String DOB, String Gender, String Location, String bloodGroup, String Address, String Phone) {
        this.ID = ID;
        this.Name = Name;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Location = Location;
        this.bloodGroup = bloodGroup;
        this.Address = Address;
        this.Phone = Phone;
    }

    public abstract void showPersonInf();

}
