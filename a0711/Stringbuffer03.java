package a0711;

public class Stringbuffer03 {
    public static void main(String[] args) {
        Stringbuffer str = new Stringbuffer("Java Oracle");
        System.out.println("원본 문자열 : " + str);
        

        System.out.println(str.delete(4,8));
        System.out.println(str.deleteCharAt(1));
        System.out.println("deleteCharAt() 메소드 호출 후 원본 문자열 : " + str);
        
    }
}
