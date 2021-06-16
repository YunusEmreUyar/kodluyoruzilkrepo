import java.utils.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
	int math, phys, chem, turkish, music, history;
	String statement;
	System.out.println("Enter your math score:");
	math = inp.nextInt();
	System.out.println("Enter your phys score:");
	phys = inp.nextInt();
	System.out.println("Enter your chem score:");
	chem = inp.nextInt();
	System.out.println("Enter your turkish score");
	turkish = inp.nextInt();
	System.out.println("Enter your music score:");
	music = inp.nextInt();
	System.out.println("Enter your history score:");
	history = inp.nextInt();
	statement = (math+phys+chem+turkish+music+history)>60?"Sınıfı Geçti":"Sınıfta Kaldı";

    }
} 

