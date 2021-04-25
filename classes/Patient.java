package classes;
import java.lang.*;
import java.util.Scanner;

public class Patient extends Person {
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



    public static void userInput(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your id: ");
        String id=scanner.next();
        System.out.print("Enter your name: ");
        String name=scanner.next();
        System.out.print("Enter your date of birth: ");
        String dob=scanner.next();
        System.out.print("Enter your gender: ");
        String gender=scanner.next();
        System.out.print("Enter your location: ");
        String location=scanner.next();
        System.out.print("Enter your blood Group: ");
        String bloodGroup=scanner.next();
        System.out.print("Enter your address: ");
        String address=scanner.next();
        System.out.print("Enter your phone: ");
        String phone=scanner.next();

        Patient p=new Patient(id,name,dob,gender,location,bloodGroup,address,phone);
        //p.showPersonInf();


    }



    public void showPersonInf(){
        System.out.println("==== Patient Info's ====\n");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name );
        System.out.println("DOB: " + this.DOB);
        System.out.println("Gender: " + this.Gender);
        System.out.println("Blood Group: " + this.bloodGroup);
        System.out.println("Phone: " + this.Phone);
        System.out.println("Location: " + this.Location);
        System.out.println("Address: " + this.Address);
        System.out.println("Fees: " + this.Fees);
        System.out.println("Status: " + this.Status);
    }

}
