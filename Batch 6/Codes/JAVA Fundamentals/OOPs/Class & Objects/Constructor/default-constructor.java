
class Person{

    // date members (variables)
    private String name;
    private int rollNumber;
    private String college;

    /*
     *   Constructor
     *
     *   1. it should always be public.
     *   2. Name of constructor should be same of class.
     *   3. It does not have any return type - not even void.
     *   4. It get called automatically when we create the object.
     * */

    public Person(){
        System.out.println("im inside the constructor\n\n");
        name = "Adana";
        rollNumber = 1;
        college = "TKIET";
    }

    // methods (function)
    public void details(){
        System.out.println("Name of the Person: " + name);
        System.out.println("Roll Number of the Person: " + rollNumber);
        System.out.println("College Name of the Person: " + college);
    }

}


public class Main {
    public static void main(String[] args) {

        // Object of class Person
        Person adnan = new Person();
        adnan.details();

        Person pramod = new Person();
        pramod.details();

        Person siddhi = new Person();
        siddhi.details();




    }
}