public class MethodsPrac5 {
    
    static boolean isPrime(int n, int div) {
        if (n<2) {
            return false;
        } 
        if (n%div == 0) {
            return false;
        }
        if (div*div>n) {
            return true;
        }
        return isPrime(n, div+1);
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(11, 2)? "Prime": "Not Prime");
        System.out.println(isPrime(13, 2)? "Prime": "Not Prime");
        System.out.println(isPrime(15, 2)? "Prime": "Not Prime");
    }
}
