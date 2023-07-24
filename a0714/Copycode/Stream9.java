package a0714.Copycode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//문자열로 구성된 리스트에서 길이가 5 이상인 문자열을 필터링하고, 필터링된 문자열들을 대문자로 반환하여 콤마(,)로 구분 
public class Stream9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "carrot", "dragonfruit","eggplant");

        String result = strings.stream()
        .filter(s -> s.length() >= 5)
        .map(String::toUpperCase)
        .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
