package a0704_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QZ_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요");
        float num = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("#.##");
        String rounded = df.format(num);
        System.out.println(rounded);

        scanner.close();
    }
} // 소숫점 2번째 자리에서 반올림해서 출력
