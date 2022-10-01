package utility;

import java.util.List;

public class HelperImpl implements HelperIF {

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void print(int number1, int number2) {
        System.out.println(number1 + " " + number2);
    }


}
