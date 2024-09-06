import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);
        
            String input = "";

                System.out.println("Type somethingd");
        
        //input = "Hello";

        input = in.nextLine();

        System.out.println("You typed " + input);

    }
}