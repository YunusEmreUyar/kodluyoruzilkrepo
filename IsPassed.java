import java.util.Scanner;

public class IsPassed {
    public static void main(String[] args) {
        int math, physics, turkish, chem, music;
        Scanner inp = new Scanner(System.in);
        
        // User inputs here.
        System.out.println("Give me your math score: ");
        math = inp.nextInt();
        System.out.println("Give me your physics score: ");
        physics = inp.nextInt();
        System.out.println("Give me your turkish score: ");
        turkish = inp.nextInt();
        System.out.println("Give me your chem score: ");
        chem = inp.nextInt();
        System.out.println("Give me your music score: ");
        music = inp.nextInt();

        double average = (math + physics + turkish + chem + music)/5;
        if (average > 55) {
            System.out.println("You passed");
        } else {
            System.out.println("Your average is : "+ average +"\n:(");
        }
    }    
}
