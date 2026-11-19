
// Multilevel Inheritance


// Parent Class
class Animal{
    protected String type;
}

// Child class -> Parent of Class GodlenRetriver
class Dog extends Animal{
    protected String breed;
}

// Child class
class GoldenRetriver extends Dog{
    protected String sound;

    public GoldenRetriver(){
        type = "Dog";
        breed = "GoldenRetriver";
        sound = "Barking";
    }

    public void detailsOfTheGodenRetriver(){
        System.out.println("Type of Animal: " + type);
        System.out.println("Breed of Animal: " + breed);
        System.out.println("Sound of Animal: " + sound);
    }
}

public class Main {
    public static void main(String[] args) {

        GoldenRetriver goldenRetriver = new GoldenRetriver();
        goldenRetriver.detailsOfTheGodenRetriver();
    }
}