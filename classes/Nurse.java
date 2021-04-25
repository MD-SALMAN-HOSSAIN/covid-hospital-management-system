package classes;
import java.lang.*;

public class Nurse{
    private String id;
    private String name;
    private String gender;
    private String ability;

    public Nurse(String id, String name, String gender, String ability) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.ability = ability;
    }

    public void showNurseInfo(){

        System.out.println("Nurse Work done!");
    }


}
