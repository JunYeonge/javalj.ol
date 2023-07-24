package a0714;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Person4 person4 = new Person4();
        person4.ordering( String :: compareToIgnoreCase);
        //메소드 참조가 가능하다.
        // String 클래스에 정의된 메소드
        // 대소문자를 무시하고 두문자열을 사전적으로 비교
    }
}
