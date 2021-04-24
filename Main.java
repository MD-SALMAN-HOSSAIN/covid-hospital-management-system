import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        Patient patient = new Patient("11100", "Olive", "2000-02-02", "Female", "Dhaka", "B+", "Bashundura", "019");
        patient.setFees(500.0);
        patient.setStatus("New Patient");
        patient.showPersonInf();
    }
}
