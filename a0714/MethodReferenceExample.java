package a0714;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person3 person3 = new Person3();

        //정적 메소드일 경우
        //람다식
        //person3.action((x, y) -> Computer.staticMethod(x,y));
        //메소드 참조
        person3.action(Computer :: staticMethod);

        //인스턴스 메소드일 경우
        Computer com = new Computer();

        //람다식
        //person.action((x, y) -> com.instanceMethod(x, y));
        //메소드 참조
        person3.action( com :: instanceMethod);
    }
}
