package a0704_1;

import java.util.Scanner;

public class QZ_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("영문자를 입력해주세요>");

        String str = scan.nextLine();
        char c = str.charAt(0);
        int num = c;
        System.out.println(num);
    }
}
