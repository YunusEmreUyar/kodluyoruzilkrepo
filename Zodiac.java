import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What year you were born?");
        int year = in.nextInt();
        String zodiac = "";

        switch (year%12) {
            case 1:
                zodiac = "Monkey";
                break;
            case 2:
                zodiac = "Rooster";
                break;
            case 3:
                zodiac = "Dog";
                break;
            case 4:
                zodiac = "Pig";
                break;
            case 5:
                zodiac = "Mouse";
                break;
            case 6:
                zodiac = "Ox";
                break;
            case 7:
                zodiac = "Tiger";
                break;
            case 8:
                zodiac = "Rabbit";
                break;
            case 9:
                zodiac = "Dragon";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
            case 12:
                zodiac = "Monkey";
                break;
        }
        System.out.println(zodiac);


        in.close();
    }
}