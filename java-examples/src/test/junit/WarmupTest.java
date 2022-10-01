package test.junit;

import org.junit.Test;
import warmup.WarmupProblem;
import warmup.WarmupSolution;

import java.util.ArrayList;
import java.util.List;

public class WarmupTest {

    WarmupProblem warm = new WarmupSolution();

    @Test
    void minMaxSumTest() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(11);
        list.add(7);
        list.add(15);

        //Assert.assertEquals("22 36", warm.miniMaxSum(list));
    }
}





