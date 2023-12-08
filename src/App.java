import java.util.Scanner;

import solutions.*;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {           
            System.out.println("MENU:");
            System.out.println("Type the digit corresponding the challenge.");
            System.out.println("1- SOLVE ME FIRST | 2- SIMPLE ARRAY SUM | 3- COMPARE THE TRIPLETS");
            System.out.println("4- A VERY BIG SUM |                     |");

            String option = scan.next();
            switch (option) {
                case "1":
                    System.out.println("SOLVE ME FIRST");
                    System.out.println("Instructions:");
                    System.out.println("Type the first number, press ENTER, then type the second number. Press ENTER.");
                    SolveMeFirst solveMeFirst = new SolveMeFirst();
                    solveMeFirst.solve();
                    break;
                case "2":
                    System.out.println("SIMPLE ARRAY SUM");
                    System.out.println("Instructions:");
                    System.out.println("Type the SIZE of the array, press ENTER. Then type all the array numbers, pressing ENTER between them.");
                    SimpleArraySum simpleArraySum = new SimpleArraySum();
                    simpleArraySum.sum();
                    break;
                case "3":
                    System.out.println("COMPARE THE TRIPLETS");
                    System.out.println("Instructions:");
                    System.out.println("Type three numbers for Alice's list, pressing ENTER between them. Then, do the same for Bob's list.");
                    CompareTheTriplets compareTheTriplets = new CompareTheTriplets();
                    compareTheTriplets.compare();
                    break;
                case "4":
                    System.out.println("A VERY BIG SUM");
                    System.out.println("Instructions:");
                    System.out.println("Type the number of elements you want to sum. Then press ENTER.");
                    System.out.println("Type the long elements pressing ENTER between them.");
                    AVeryBigSum aVeryBigSum = new AVeryBigSum();
                    aVeryBigSum.sum();
                    break;
            }
            System.out.println("END OF OPERATION.");
            System.out.println("CODE BY FRANCO FRASSANITO WOLFF");
        }

        
    }
}
