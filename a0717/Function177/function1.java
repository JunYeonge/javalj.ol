package a0717.Function177;

interface Calculator {
    int sum(int a, int b);
}

public class MyCalculator implements Calculator{
    public int sum(int a, int b) {
        return a+b;
    }
    }

public class function1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3,4);
        System.out.println(result); // 7출력
}
}
