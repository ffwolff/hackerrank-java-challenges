package solutions;

import java.util.Scanner;

public class CompareTheTriplets {
    public static final int SIZE = 3;
    Scanner in = new Scanner(System.in);
    int[] aList = new int[SIZE];
    int[] bList = new int[SIZE];
    int aScore = 0;
    int bScore = 0;

    public void compare() {
        for (int i = 0; i < SIZE; i++){
            this.aList[i] = in.nextInt();
        }
        for (int i = 0; i < SIZE; i++){
            this.bList[i] = in.nextInt();
        }
        for (int i = 0; i < SIZE; i++){
            if(aList[i] > this.bList[i]){
                this.aScore++;
            } else if(bList[i] > this.aList[i]){
                this.bScore++;
            }
        }
        System.out.println(aScore + " " + bScore);
    }
}
