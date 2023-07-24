package a0711;

public class Wrappre01 {
    public static void main(String[] args, int value) {
        // Integer num = new Integer(17);
        Integet num = Integer.valueOf(17);
        int n = num.intValue();
        System.out.println(n);

        Character ch = "X";
        char c = ch;
        System.out.println(c);
    }
}
