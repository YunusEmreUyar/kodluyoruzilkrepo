import java.util.Scanner;

public class LoopPractice9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int right=3, balance=1500;
        int selection;

        while(right>0) {
            System.out.print("Enter your username: ");
            String userName = in.nextLine();
            System.out.print("Enter your password: ");
            String passwd = in.nextLine();

            if(userName.equals("dumbusername") && passwd.equals("dumbpasswd")) {
                System.out.println("Welcome!");
                do {
                    System.out.println("1 => withdraw money\n2 => deposit\n3 => balance");
                    selection = in.nextInt();
                    switch(selection) {
                        case 1:
                            System.out.print("Enter amount: ");
                            int temp = in.nextInt();
                            if(temp<balance) {
                                balance -= temp;
                            } else {
                                System.out.println("This amount is greater than your balance!");
                                break;
                            }
                            System.out.println("Your new balance is: " + balance);
                            break;
                        case 2:
                            System.out.print("Enter amount: ");
                            int temp2 = in.nextInt();
                            if(temp2>=0) {
                                balance += temp2;
                            } else {
                                System.out.println("You can not deposit less than 1.");
                                break;
                            }
                            System.out.println("Your new balance is: " + balance);
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;
                    }
                }while(right>0);

            } else {
                right--;
                System.out.println("Bad Credentials Error!!");
                if(right==0) {
                    System.out.println("YOur account is blocked.");
                }
            }
        }


    }
}