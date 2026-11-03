
/* Access specifiers

    1. Private - You can access only inside the class, you cannot access outside of the class.
    2. Public - You can access anywhere, inside the class, outside of the class, outside of the file
    3. Protected - (will be completed in inheritance)


    Rule -
    1. Your data members (Variables) should always be private
    2. Your methods (functions) should always be public

*/

class Person{

    // date members (variables)
    private String name = "Adnan";
    private int rollNumber = 102;
    private String college = "TKIET";
 

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

        // members of the class
        adnan.details();

    }
}