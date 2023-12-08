import solutions.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("SOLVE ME FIRST");
        System.out.println("Instructions:");
        System.out.println("Type the first number, press ENTER, then type the second number. Press ENTER.");
        SolveMeFirst solveMeFirst = new SolveMeFirst();
        solveMeFirst.solve();

        System.out.println("SIMPLE ARRAY SUM");
        System.out.println("Instructions:");
        System.out.println("Type the SIZE of the array, press ENTER. Then type all the array numbers, pressing ENTER between them.");
        SimpleArraySum simpleArraySum = new SimpleArraySum();
        simpleArraySum.sum();

        System.out.println("COMPARE THE TRIPLETS");
        System.out.println("Instructions:");
        System.out.println("Type three numbers for Alice's list, pressing ENTER between them. Then, do the same for Bob's list.");
        CompareTheTriplets compareTheTriplets = new CompareTheTriplets();
        compareTheTriplets.compare();


        
    }
}
