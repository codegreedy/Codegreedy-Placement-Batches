
public class Main {
    public static void main(String[] args) {

        /*
        *   StringBuilder
        *   StringBuffer
        *
        *   Both the strings are mutable - which means we can modify the strings
        *
        * */
        String name;
        StringBuilder s = new StringBuilder("Java");
        System.out.println("Original : " + s);

        // append - mainly used to add new char at the end of the string
        s.append('P');
        s.append('r');
        System.out.println(s);

        int n = s.length();

        // deleteCharAt(index) - mainly deletes the char at the given index
        s.deleteCharAt(n - 1);
        System.out.println(s);

        // setCharAt(index) - mainly sets/insert/put the new char at the given index
        s.setCharAt(4, 'Z');
        System.out.println(s);
        
        // toString() - mainly converts your StringBuilder & StringBuffer into String
        String ch = s.toString();
        System.out.println(ch);

        // reverse - mainly used to reverse the string
        s.reverse();
        System.out.println(s);

    }
}