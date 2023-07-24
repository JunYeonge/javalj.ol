package a0714;


import java.util.Random;
import java.util.stream.IntStream;


public class St4 {
    public static void main(String[] args) {
        //가변 매개변수에서 스트림 생성
        IntStream stream1 = new Random().ints(4);

        stream1.forEach(System.out::println);
    }
}
