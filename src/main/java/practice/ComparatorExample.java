package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static List<Integer> descendingOrderSort(List<Integer> nums) {
       /* nums.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });*/

        nums.sort((a,b) -> b.compareTo(a));
        return nums;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,1,9,3);
        System.out.println(ComparatorExample.descendingOrderSort(nums));
    }
}
