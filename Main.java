import java.lang.*;
import classes.*;
import java.util.*;

public class Main {

    public static void checking(int option){

        if(option==1){
            Scanner scanner=new Scanner(System.in);

            //diseases name
            System.out.println("1..fever");
            System.out.println("2..cough");
            System.out.println("3..Headache");
            System.out.println("4..Back pain");
            System.out.print("Choose an option: ");
            int option2=scanner.nextInt();
            if(option2==1){
                System.out.println("Take napa and Simethicone");
            }
            else if(option2==2){
                System.out.println("Take ofCaugh and Tushka");
            }
            else if(option2==3){
                System.out.println("Take nap extra and rizatriptan (Maxalt, Maxalt-MLT)");
            }
            else{
                System.out.println("Take tramadol or naproxen ");
            }
        }



        if(option==2){
            Scanner scanner=new Scanner(System.in);
            System.out.print("What type of doctor you want to appoint: ");
            System.out.println("1..Medicine ");
            System.out.println("2..Surgeon  ");
            int option2=scanner.nextInt();
            if(option2==1){
                setDoctor(1);
            }
            else if(option2==2){
                setDoctor(2);
            }

        }
        else if(option==3){
            System.out.println("this system can't cure your problem");
        }
    }










    public static void diseasesSelection(){

        Scanner scanner=new Scanner(System.in);

        Diseases d=new Diseases();
//diseases category
        System.out.println("1..General");
        System.out.println("2..Complex");
        System.out.println("3..Extremely completed");
        System.out.println("choose an option: ");
        int option=scanner.nextInt();
        checking(option);

    }

    public static void setDoctor(int option){
        Nurse n=new Nurse("3000","Jara","Female","Surgery");
        if(option==1){
            Doctor d=new Doctor("2000","Nasir","Medicine","Male","01237183128");
            d.doctor1();

        }
        else if(option==2){
            Doctor d2=new Doctor("2001","Izaz","Surgeon","Male","981274897231");
            d2.doctor2(n);
        }

    }



    public static void main(String args[]) {

//        Patient patient = new Patient("11100", "Olive", "2000-02-02", "Female", "Dhaka", "B+", "Bashundura", "019");
//        patient.setFees(500.0);
//        patient.setStatus("New Patient");
//        patient.showPersonInf();
            Patient.userInput();
            diseasesSelection();

    }
}
