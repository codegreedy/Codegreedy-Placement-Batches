
/*
*  1. Parameter must be different (type must be different, not name of the variables)
*  2. Return type of the method does not matter.
*  3. All the methods should be in same clas.

* */

class Math{

    public void add(int x, int y){
        System.out.println("Addition of Integer: " + (x + y));
    }

    public void add(int x){
        System.out.println("Addition of Integer: " + (x));
    }

    public void add(float x, int y){
        System.out.println("Addition of Integer: " + (x + y));
    }

    public void add(int x, float y){
        System.out.println("Addition of Integer: " + (x + y));
    }

    public void add(char x){
        System.out.println("Addition of Integer: " + (x));
    }

    public void add(){
        System.out.println("hello");
    }
    
}

public class Main {
    public static void main(String[] args) {

        Math math = new Math();
        math.add();

    }
}