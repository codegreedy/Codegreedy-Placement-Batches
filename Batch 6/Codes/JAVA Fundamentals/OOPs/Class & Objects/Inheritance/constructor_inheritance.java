
// Parent Class
class Person{

    protected int age;
    protected String name;

    // parent constructor
    public Person(){
        System.out.println("Im in the contructor of the Person class");
    }

    // method
    public void details(){
        System.out.println("Name of the Person: " + name);
        System.out.println("Age of the Person: " + age);
    }
}

// Child class
class Pramod extends Person{

    int age;
    String name;

    // Constructor
    public Pramod(){
        System.out.println("Im in the contructor of the Pramod class");
        name = "Pramod";
        age = 25;
    }
}

public class Main {
    public static void main(String[] args) {

        Pramod pramod = new Pramod();


    }
}