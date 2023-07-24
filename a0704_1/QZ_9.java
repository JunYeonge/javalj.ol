package a0704_1;

import java.util.Scanner;

public class QZ_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 한개를 입력 해주세요");

        int num = scan.nextInt();

        switch(num) {
            case 12:
            case 1 :
            case 2 :
            System.out.println("winter");
            break;
            case 3 :
            case 4 :
            case 5 :
            System.out.println("spring");
            break;
            case 6 :
            case 7 :
            case 8 :
            System.out.println("summer");
            break;
            // case 9 :
            // case 10 :
            // case 11 :
            default :
            System.out.println("fall");
            break;
        }
    }
}
