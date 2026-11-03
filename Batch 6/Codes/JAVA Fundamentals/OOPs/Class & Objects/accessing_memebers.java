
// Class Name's first letter should always be capital letter
class Person{

    // date members (variables)
    String name = "Adnan";
    int rollNumber = 102;
    String college = "TKIET";


    // methods (function)
    void details(){
        System.out.println("Name of the Person: " + name);
        System.out.println("Roll Number of the Person: " + rollNumber);
        System.out.println("College Name of the Person: " + college);
    }

}


public class Main {
    public static void main(String[] args) {

        // Object of class Person
        Person adnan = new Person();

        // members of the class
        adnan.details();

    }
}