
// Parent Class
class Animal{
    protected String type;
    protected String sound;

    public void detailsOfAnimal(){
        System.out.println("Type of animal is: "+ type);
        System.out.println("Sound of animal is: "+ sound);
    }
}

// Child Class
class Dog extends Animal{

    public Dog(){
        type = "Dog";
        sound = "Barking";
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.detailsOfAnimal();


    }
}