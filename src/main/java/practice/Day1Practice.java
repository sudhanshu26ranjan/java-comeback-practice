package practice;

import java.util.Arrays;
import java.util.List;

//29.05.2026
public class Day1Practice {
    public static void main(String[] args) {
        System.out.println("Java comeback journey started for Sudhanshu!");
        List<Integer> nums = Arrays.asList(1,2,3,4);

        nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
