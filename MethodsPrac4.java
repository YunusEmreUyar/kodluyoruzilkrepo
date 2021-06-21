public class MethodsPrac4 {
    
    static int takePower(int base, int pow) {
        if (pow==0) {
            return 1;
        }
        return base*takePower(base, pow-1);
    }
    
    
    public static void main(String[] args) {
        System.out.println(takePower(3, 4));
    }
}
