package a0707;

import java.util.Scanner;

public class QZ_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요>");
        int a = scan.nextInt();
        System.out.println("숫자를 입력해주세요>");
        int b = scan.nextInt();
    
        // int x = ;

        if( b % a == 0) {
            System.out.println(a + "*" + b / a + "=" + b);
        } else if(a % b == 0) {
            System.out.println(b + "*" + a / b + "=" + a);
        }else{
            System.out.println("none");
        }
    }
}
