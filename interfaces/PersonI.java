package interfaces;
import classes.*;

public interface PersonI {
    public abstract Doctor searchDoctor(String ID);
    public abstract Patient searchPatient(String ID);
    public abstract Employee searchEmployee(String ID);

    public abstract boolean removeDoctor(String ID);
    public abstract boolean removePatient(String ID);
    public abstract boolean removeEmployee(String ID);

    public abstract boolean insertDoctor(String ID);
    public abstract boolean insertPatient(String ID);
    public abstract boolean insertEmployee(String ID);

    public abstract void setSalary(double salary);

    public abstract void showPersonInf();
}
