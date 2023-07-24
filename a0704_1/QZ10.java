package a0704_1;

import java.util.Scanner;

public class QZ10 {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int n = san.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
