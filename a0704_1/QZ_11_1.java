package a0704_1;

import java.util.Scanner;

public class QZ_11_1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        int[] num = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println("숫자를 입력 해주세요");
            num[i] = sca.nextInt();
        }
        int min = num[0];
        for(int i = 0; i < num.length; i++){
            if(min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("최소값은" + min);
    }
}
