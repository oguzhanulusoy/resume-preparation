package warmup;

import sorting.SortIF;
import sorting.SortImpl;
import utility.HelperIF;
import utility.HelperImpl;

import java.util.List;

public class WarmupSolution implements WarmupProblem {

    @Override
    public int solveMeFirst(int a, int b) {
        if ((a >= 1 && a <= 1000) && (b >= 1 && b <= 1000)) {
            return a + b;
        }
        return -1;
    }

    @Override
    public void miniMaxSum(List<Long> arr) {
        SortIF sort = new SortImpl();
        sort.selectionSortLong(arr);

        if (arr.size() > 5) {
            new Exception("Invalid input");
        } else {
            boolean isValid = true;
            for (int i = 0; i < arr.size(); i++) {
                if (!(arr.get(i) >= 1 && arr.get(i) <= (int) Math.pow(10, 9))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                int min = 0, max = 0;

                for (int i = 0; i < arr.size() - 1; i++) {
                    min += arr.get(i);
                }
                for (int i = 1; i < arr.size(); i++) {
                    max += arr.get(i);
                }
                HelperIF helper = new HelperImpl();
                helper.print(min, max);
            } else {
                new Exception("Invalid input");
            }
        }
    }

    @Override
    public int simpleArraySum(List<Integer> arr) {
        int sum = 0;
        if (arr.size() > 0) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) <= 1000) {
                    sum += arr.get(i);
                } else {
                    continue; // invalid data
                }
            }
        } else {
            new Exception("Invalid list");
        }
        return sum;
    }

    @Override
    public long aVeryBigSum(List<Long> arr) {
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}