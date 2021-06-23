import java.util.Scanner;

public class Others2 {
    
    static boolean isPalindromic(String str) {
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word.");
        String word = in.nextLine();
        
        if (word.split(" ").length>1) {
            String[] words = word.split(" ");

            for (String item: words) {
                System.out.println(item + " is " +(isPalindromic(item)? "Palindromic": "Not palindromic"));        
            }
        } else {
            System.out.println(word + "is" +(isPalindromic(word)? "Palindromic": "Not palindromic"));
        }
        
        in.close();
    }
}
