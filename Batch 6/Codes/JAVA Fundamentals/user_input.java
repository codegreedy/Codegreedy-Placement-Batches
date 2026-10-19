import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        System.out.println("age of the person: " + age);

        boolean isPresent = sc.nextBoolean();
        System.out.println(isPresent);

        double weight = sc.nextDouble();
        System.out.println(weight);

        String name = sc.next(); // mainly used to scan single word
        System.out.println(name);

        String fullName = sc.nextLine(); // mainly used to scan multiple words/sentence
        System.out.println(fullName);
        
        float f = sc.nextFloat();
        System.out.println(f);
    }
}