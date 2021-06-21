public class LoopPractice14 {
    public static void main(String[] args) {
        String msg = "";

        for(int i=2; i<100; i++) {
            int counter = 0;
            for(int j = 1; j<=i; j++) {
                if(i%j==0) {
                    counter++;
                }
            }
            if(counter<=2) {
                msg += i + " ";
            }
        }
        System.out.println(msg);
    }  
}
