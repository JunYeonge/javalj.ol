package a0704_1;

import java.util.Scanner;

public class QZ_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("실수를 입력 해주세요> ");  
        float num = scan.nextFloat();
        // System.out.printf("%.2f",num);

        num = (num + 0.005f) * 100;
        System.out.println(num);
        int i = (int) num;
        System.out.println(i);
        num = (float) i/100;
        System.out.println(num);
    }
}
