package a0711;

public class StrindBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
        .append("DEF")
        .insert(0, "ABC")
        .delete(3, 4)
        .toString();

        System.out.println(data);
    }
}
// StringBuilder는 가변성을 가진 클래스로, 문자열을 추가, 수정, 삭제하는 등의 작업을 