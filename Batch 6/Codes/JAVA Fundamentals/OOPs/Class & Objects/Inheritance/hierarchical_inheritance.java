
// Hierarchical Inheritance

// Parent class
class Person{
    protected String name;
    protected int age;
    protected String branch;

    public void details(){
        System.out.println("Name of the person: " + name);
        System.out.println("Name of the age: " + age);
        System.out.println("Name of the branch: " + branch);
        System.out.println();
    }
}

// Child Class
class Pramod extends Person{

    public Pramod(){
        name = "Pramod";
        age = 26;
        branch = "CSE";
    }
}

// Child Class
class Komal extends Person{

    public Komal(){
        name = "Komal";
        age = 26;
        branch = "IT";
    }
}

// Child Class
class Gaurihar extends Person{

    public Gaurihar(){
        name = "Gaurihar";
        age = 21;
        branch = "Mech";
    }
}


public class Main {
    public static void main(String[] args) {

        Pramod pramod = new Pramod();
        pramod.details();

        Komal komal = new Komal();
        komal.details();
    }
}