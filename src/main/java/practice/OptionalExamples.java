package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExamples {
    public static void getDefaultName(){
        Optional<String> name = Optional.empty();
        System.out.println(name.orElse("Default Name"));
    }

    public static void findFirstOptional() {
        List<String> names = Arrays.asList(
                "Rahul",
                "John",
                "Amit"
        );
        String nameStartsWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst()
                .orElse("Not Found");
        System.out.println(nameStartsWithA);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
//        getDefaultName();
        findFirstOptional();

    }
}
