package solutions;
import java.util.*;

public class DiagonalDifference {
    List<List<Integer>> arr = new ArrayList<>();

    public void addIntList() {

    }

     public int solve() {
        int diagonal = 0;

        for (int i = 0; i < this.arr.size(); i++) {
            diagonal += this.arr.get(i).get(i);
            diagonal -= this.arr.get(i).get(this.arr.size() - (i + 1));
        }

        int num =  Math.abs(diagonal);
        return num;
    }

    public DiagonalDifference(List<List<Integer>> arr) {
        this.arr = arr;
    }

    public List<List<Integer>> getArr() {
        return this.arr;
    }

    public void setArr(List<List<Integer>> arr) {
        this.arr = arr;
    }

}
