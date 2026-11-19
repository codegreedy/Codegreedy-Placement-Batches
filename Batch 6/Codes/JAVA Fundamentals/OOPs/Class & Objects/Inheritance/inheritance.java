
// Parent
class Student{

    String name;
    int age;

    public void info(){
        System.out.println("This is a parent class student");
    }
}

// Child
class Shrutika extends Student{


    public Shrutika(){
        name = "Shrutika";
        age = 23;
    }

    public void details(){
        System.out.println(name);
    }
}

/*
*  Inheritance - Always remembers - never create the object of parent class
*                                   Always create the object of Child class.
*
*
* */

public class Main {
    public static void main(String[] args) {

      Student student = new Student();
      Shrutika shrutika = new Shrutika();



    }
}