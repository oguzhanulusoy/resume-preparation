import warmup.WarmupProblem;
import warmup.WarmupSolution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        boostrapper();
    }

    public static void boostrapper() {
        WarmMain();
    }

    public static void WarmMain() {
        WarmupProblem warm = new WarmupSolution();
        System.out.print("1. solveMeFirst: ");
        System.out.println(warm.solveMeFirst(2, 3));

        System.out.print("2. minMaxSum: ");
        List<Long> minMaxSumList = new ArrayList<Long>();
        minMaxSumList.add(115121L);
        minMaxSumList.add(3L);
        minMaxSumList.add(11L);
        minMaxSumList.add(7L);
        minMaxSumList.add(15L);
        warm.miniMaxSum(minMaxSumList);

        System.out.print("3. simpleArraySum: ");
        List<Integer> simpleArraySumList = new ArrayList<Integer>();
        simpleArraySumList.add(1);
        simpleArraySumList.add(2);
        simpleArraySumList.add(3);
        simpleArraySumList.add(4);
        simpleArraySumList.add(10);
        simpleArraySumList.add(11);
        System.out.println(warm.simpleArraySum(simpleArraySumList));

        System.out.print("4. aVeryBigSum: ");
        List<Long> aVeryBigSumList = new ArrayList<Long>();
        aVeryBigSumList.add(45125L);
        aVeryBigSumList.add(851L);
        aVeryBigSumList.add(11L);
        System.out.println(warm.aVeryBigSum(aVeryBigSumList));
    }
}
