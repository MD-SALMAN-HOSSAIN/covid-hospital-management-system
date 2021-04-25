package classes;

public abstract class Receptionist{
    private static int fees;



    public static void surgeon(){
        fees=1200;
        System.out.println("Your fees is: "+fees);
        System.out.println("\n\n\n\n\n");
    }
    public static void medicine(){
        fees=700;
        System.out.println("Your fees is: "+fees);
        System.out.println("\n\n\n\n\n");
    }
}
