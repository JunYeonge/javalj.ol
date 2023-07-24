package a0714;

import java.util.Arrays;
import java.util.stream.Stream;

public class St7 {
    public static void main(String[] args) {
        // 가변 매개변수에서 스트림 생성
        String[] arr = { "I study hard", "You study JAVA", "I am hungry" };

        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
    }
}
