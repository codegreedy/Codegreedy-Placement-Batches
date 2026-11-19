
// Parent
class Student{

    int age = 26;

    public void detail(){
        System.out.println("I'm a student");
    }
}

// Child
class Pramod extends Student{

    public void detail(){
        System.out.println("I'm a Pramod");
    }
}

class Priyanka extends Student{

    public void detail(){
        System.out.println("Im a Priyanka");
    }
}

public class Main {
    public static void main(String[] args) {

        Pramod pramod = new Pramod();
        pramod.detail();
        System.out.println(pramod.age);


        Priyanka priyanka = new Priyanka();
        priyanka.detail();

    }
}