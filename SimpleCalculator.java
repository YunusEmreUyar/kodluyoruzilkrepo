import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int selection, number1, number2, value;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("İlk sayıyı giriniz:");
        number1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        number2 = inp.nextInt();
        
        System.out.println("Eklemek için 1\nÇıkartmak için 2\nBölmek için 3\nÇarpmak için 4:\n");
        selection = inp.nextInt();

        switch (selection) {
            case 1:
               value = number1 + number2;
               break;
            case 2:
                value = number1 - number2;
                break;
            case 3:
                value = number1 / number2;
                break;
            case 4:
                value = number1 * number2;
                break;
            default:
                value = 0;
        }
        System.out.println("Sonuç:" + value);
    }
}