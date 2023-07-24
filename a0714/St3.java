package a0714;


import java.util.stream.IntStream;


public class St3 {
    public static void main(String[] args) {
        //가변 매개변수에서 스트림 생성
        IntStream stream1 = IntStream.range(1,4);
        stream1.forEach(e -> System.out.println(e + " "));
        System.out.println();
        
        IntStream stream2 = IntStream.rangeClosed(1,4);
        stream2.forEach(e -> System.out.println(e + " "));
    }
}
