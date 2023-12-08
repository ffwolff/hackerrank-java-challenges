package solutions;

import java.util.Scanner;

public class SimpleArraySum {
    Scanner in = new Scanner(System.in);
    Scanner array = new Scanner(System.in);
    int n;
    int sum;

    public void sum() {
        this.n = in.nextInt();
        for (int i = 0; i < n; i++) {
            this.sum += array.nextInt();
        }

        System.out.println(sum);
    }
}
