package a0704_1;

import java.util.Scanner;

public class QZ_11 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("숫자를 입력 해주세요>");
        int n1 = sca.nextInt();
        System.out.println("숫자를 입력 해주세요>");
        int n2 = sca.nextInt();
        System.out.println("숫자를 입력 해주세요>");
        int n3 = sca.nextInt();

        if(n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if(n2 < n1 && n2 < n3){
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
    
}
