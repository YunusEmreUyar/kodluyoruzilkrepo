import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, passwordResetChoise;
        String newPassword;
        System.out.println("Please enter your username then your password:");
        userName = inp.nextLine();
        password = inp.nextLine();
        
        if (!userName.equals("YunusEmre") || !password.equals("Uyar1234")) {
            System.out.println("Bad credentials, do you want to reset your password?(Yes or No)");
            passwordResetChoise = inp.nextLine();
            if (passwordResetChoise.equals("Yes")) {
                System.out.println("Please type your new password: ");
                newPassword = inp.nextLine();
                if (password.equals(newPassword)) {
                    System.out.println("You hace to select a different password. Please try again later.");
                } else {
                    password = newPassword;
                }
            }
        }
    }
}
