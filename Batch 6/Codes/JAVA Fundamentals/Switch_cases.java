
public class Main {
    public static void main(String[] args) {
        
        int x = 31;


        /*

            1. in switch cases only constant intergers are allowed (int, char).
            2. Vairables, strings, floating numbers are not allowed.
            3. Order of cases can be anything.
            4. All the cases in swtich are optional

        */


        switch(3){

            case 'a':{ // ASCII - 97
                System.out.println("hello");
                break;
            }

            case 'w':{
                System.out.println("Good Bye");
                break;
            }

            case x:{
                System.out.println("Morning");
                break;
            }

            default:{
                System.out.println("Bye");
                break;
            }
        }
    }
}








