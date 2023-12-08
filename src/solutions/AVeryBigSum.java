package solutions;

import java.util.Scanner;

public class AVeryBigSum {
    Scanner in = new Scanner(System.in);
    int n;
    long sum = 0;

    public void sum() {
        this.n = in.nextInt();
        for(int i = 0; i < n; i ++){
            sum += in.nextLong();
        }
        System.out.println(sum);
    }
}
