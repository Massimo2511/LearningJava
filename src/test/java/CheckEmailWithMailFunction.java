import java.util.Scanner;

import static com.start.learn.checkemail.CheckEmail.*;

public class CheckEmailWithMailFunction {
    public static void main(String[] args) {
        //For entering phrase
        System.out.println("Write  your email: ");
        Scanner input = new Scanner(System.in);
        String enteredEmail = input.nextLine();
        enteredEmail = enteredEmail.trim();
        if (isEmailValid(enteredEmail)) {
            System.out.println("Entered email is VALID: ");
            System.out.println(enteredEmail);
        } else {
            System.out.println(">>Entered email is NOT VALID => correct mistakes above:<< ");
            System.out.println(enteredEmail);
        }
    }
}
