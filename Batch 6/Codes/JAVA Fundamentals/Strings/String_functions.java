
public class Main {
    public static void main(String[] args) {
        // String
        /*    1. String constant Pool
              2. Immutable - which means we cannot changes it value
        */

        String name = "Pramod";
        System.out.println("Name of the person : " + name);

        // charAt(index) - mainly gives you single char at given index
        System.out.println("Firs Character :  " + name.charAt(0));

        // length() - mainly gives you total number of characters
        int len = name.length();

        String fullName = new String("Pramod");
        // Here, in String values will not be compared if we use ==
        // rather, references are compared
        if (name == fullName){
            System.out.println("Both the names are same");
        }else{
            System.out.println("Different names");
        }

        // if we want to compare values of two different strings we use
        // equals()
        if (name.equals(fullName)){
            System.out.println("Both the names are same");
        }else{
            System.out.println("Different names");
        }

        // substrig - it is any continous part of string
        String s = "JavaProgramming";
        int n = s.length();
        String subString = s.substring(3, n); // [3, 6)
        System.out.println(subString);

        // contains - mainly used to check if given string is present or not in
        // our original string
        if (s.contains("Python")){
            System.out.println("present");
        }else{
            System.out.println("Not present");
        }

        String lang = s.toUpperCase();
        System.out.println(lang);

        lang = lang.toLowerCase();
        System.out.println(lang);

    }
}