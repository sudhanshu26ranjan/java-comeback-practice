package practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void filterNames() {
        List<String> names = Arrays.asList("Rahul", "Amit", "Ankit", "John");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
//                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }

    public static void loopConversionInStream(){
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        // convert this loop into stream code:
        /*for(Integer n : nums) {
            if(n % 2 == 0) {
                System.out.println(n * n);
            }
        }*/

        nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*n)
                .forEach(System.out::println);
    }

    public static List<String> filterNamesAndCollect() {
        // Write stream code to:
            // filter names starting with "A"
            // convert to lowercase
            // collect into a new List<String>
        List<String> names = Arrays.asList(
                "Rahul", "Amit", "Ankit", "John"
        );
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toLowerCase)
                .toList();
    }
    public static int evenNumberCount() {
        List<Integer> nums = Arrays.asList(2,4,5,7,8,10);
        return (int) nums.stream()
                .filter(num ->num % 2 == 0)
                .count();
    }

    public static Map<String, Integer> getNames(List<String> names) {
        //Create a Map<String, Integer> where: key = name, value = length of name
        return names.stream()
                .collect(Collectors.toMap(String::valueOf, String::length));
    }

    public static Set<Integer> findDuplicate() {
        Integer[] arr = new Integer[]{1,2,3,2,4,1,5};
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(Integer a: arr) {
            if(!unique.add(a)) {
                duplicate.add(a);
            }
        }
        return duplicate;
    }

    public static Set<Integer> findDuplicateWithStream() {
        Integer[] arr = new Integer[]{1,2,3,2,4,1,5};
        HashSet<Integer> numbers = new HashSet<>();
        return Arrays.stream(arr)
                .filter(i -> !numbers.add(i))
                .collect(Collectors.toSet());

    }

    public static void groupByStreams(){
        List<String> names = Arrays.asList(
                "Amit",
                "Rahul",
                "Amit",
                "John",
                "Rahul",
                "Amit"
        );
/*
*       Expected output: {Amit=3, Rahul=2,John=1}
* */
        Map<String, Long> frequencyToName = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(frequencyToName);
    }


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
//        StreamPractice.filterNames();
//        StreamPractice.loopConversionInStream();
//        System.out.println(StreamPractice.filterNamesAndCollect());
//        System.out.println(StreamPractice.evenNumberCount());
        /*List<String> names = Arrays.asList(
                "Amit",
                "Ankit",
                "Rahul"
        );
        Map<String, Integer> mapNames = StreamPractice.getNames(names);
        System.out.println(mapNames);*/
//        StreamPractice.groupByStreams();
//        System.out.println(findDuplicate());
        System.out.println(findDuplicateWithStream());
    }


}
