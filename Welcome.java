import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {

        String username;
        String password;

        username = "CSC201";
        password = "Java";

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String name = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Password; ");
        String word = input2.next();

        if (name.equals ("CSC201") && word.equals ("Java"))
            System.out.println("Welcome CSC201");
         else
            System.out.println("Invalid Username or Password");

    }
}
