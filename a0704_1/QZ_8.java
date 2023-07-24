package a0704_1;

import java.util.Scanner;

public class QZ_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력해주세요>");
        int num1 = scan.nextInt();
        System.out.println("두번째 정수를 입력해주세요>");
        int num2 = scan.nextInt();
        // char scr = (num1 < num2) ? num2 : num1;
        int src;
        if(num1 > num2) {
            src = num1;
        } else {
            src = num2;
        }

        System.out.println(src);
    }
}
