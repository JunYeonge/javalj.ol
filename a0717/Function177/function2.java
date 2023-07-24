package a0717.Function177;

@FunctionalInterface

interface Calculator {
    int sum(int a, int b);
}
//여기서 주의해야 할 점은 Calculator 인터페이스의 메서드가 1개 이상이면 함다함수를 사용할 수 없다는 점이다.
public class function2 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3,4);
        System.out.println(result); // 7출력
    }
}
//괄호 사이의 int a, int b 는 Calculator 인터페이스의 sum 함수의 입력항목에 해당하고
// -> 뒤의 a + b 가 리턴 값에 해당된다
// 이렇게 람다함수를 하용하면
//MyCalculator와 같은 실제 클래스 없이도 Calculator 객체를 생성할 수 있다. 