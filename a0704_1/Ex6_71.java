package a0704_1;

public class Ex6_71 {
    public static void main(String[] args) {
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multply());
        System.out.println(mm.divide());

        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multply(200L,100L));
        System.out.println(MyMath2.divide(200L,100L));
    }
}

class MyMath2 {
    long a, b;
    // 인스턴스 변수 a,b 만을
    long add() {return a + b;}
    long subtract() { return a - b;}
    long multply() { return a * b;}
    double divide() {return a / b;}

    static long add (long a, long b) { return a + b;}
    static long subtract ( long a, long b) { return a - b;}
    static long multply ( long a, long b) { return a * b;}
    static double divide (long a, long b) { return a / (double) b;}

}