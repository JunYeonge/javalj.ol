package a0714;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        List<Integer> distinctNunbers =  numbers.stream()
        .distinct()
        .collect(Collectors.toList());

        System.out.println(distinctNunbers);
    }
}
