package a0711;

public class Stringbuffer {
    public Stringbuffer(String string) {
    }

    public static void main(String[] args) {
        Stringbuffer str = new Stringbuffer("Java");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.append("수업"));
        System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);
    }

    public char[] capacity() {
        return null;
    }
}
