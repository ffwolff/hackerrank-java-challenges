import java.util.Scanner;

public class App {

    static int solveMeFirst (int a, int b) {
        return a + b;
    }

    static int SimpleArraySum (int n) {
        try (Scanner array = new Scanner(System.in)) {
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += array.nextInt();
            }

            return sum;
        }
    }


    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            
            System.out.println(SimpleArraySum(n));
        }
    }
}
