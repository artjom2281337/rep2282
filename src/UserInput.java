import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        int result = 0;
        
            String input = "";
            
                // Integer values

        System.out.println("10x Multiplier");

        input = in.nextLine();

        result = Integer.parseInt(input) * 10;     // Converter from String to int

        System.out.println(result);

        //         System.out.println("Type somethingd");
        
        // //input = "Hello";

        // input = in.nextLine();

        // System.out.println("You typed " + input);

    }
}