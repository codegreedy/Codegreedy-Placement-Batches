

class Person{

    // date members (variables)
    private String name;
    private int rollNumber;
    private String college;


    // constructor 
    public Person(String name, int rollNumber, String college){
        System.out.println("In the constructor");
        this.name = name;
        this.rollNumber  = rollNumber;
        this.college = college;
    }

    // methods (function)
    public void details(){
        System.out.println("Name of the Person: " + name);
        System.out.println("Roll Number of the Person: " + rollNumber);
        System.out.println("College Name of the Person: " + college);
        System.out.println();
    }

}


public class Main {
    public static void main(String[] args) {

        // Object of class Person

        Person pramod = new Person("Pramod", 101, "TKIET");
        pramod.details();
    }
}