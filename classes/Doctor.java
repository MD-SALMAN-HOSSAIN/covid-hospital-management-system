package classes;
import java.lang.*;
import java.util.Scanner;

public class Doctor{
    private String Salary;
    public String Schedule;

    private String id;
    private String name;
    private String speciality;
    private String gender;
    private String number;

    public Doctor(String id, String name, String speciality, String gender, String number) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.gender = gender;
        this.number = number;
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

    public void doctor1(){
        System.out.println("====    ====\n");
        System.out.println("Get doctor 1");
        Receptionist.medicine();
        ////
        System.out.println("Do you want to check your problem again if yes press 'y' if not press 'n ");
        Scanner scanner=new Scanner(System.in);
        String option=scanner.next();
        if(option.equals("y")){
            Patient.userInput();
        }
        else{

        }
        //////

    }
    public void doctor2(Nurse d){
        System.out.println("====    ====\n");
        d.showNurseInfo();
        Receptionist.surgeon();
        Patient.userInput();
    }


}
