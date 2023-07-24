package a0703;

import java.util.Scanner;

public class Book6QZ_4 {
    public static void main(String[] args) {
        
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int test = 0;
        int[] scores = null;

while(run) {

    System.out.println("------------------------------------------------------------");
    System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
    System.out.println("------------------------------------------------------------");
    System.out.println("선택>");

    int selectno = scanner.nextInt();

    if(selectno == 1) {
        System.out.print("학생수> ");
        test = scanner.nextInt();
        scores = new int[test];
    } else if(selectno == 2) {

        for (int i = 0; i < test; i++) {
            System.out.print("scores[" + i + "]>");
            scores[i] = scanner.nextInt();

        }
    } else if(selectno == 3) {
        for (int i = 0; i < test; i++) {
            System.out.println("scores[" + i + "]:" + scores[i]);
        }
    }else if(selectno == 4) {
        int max = 0;
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i <test; i++) {
            if(scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }
        avg = (double)sum / test;

        System.out.println("최고 점수:" + max);
        System.out.println("평균 점수:" + avg);
    } else if(selectno == 5) {
        run = false;
    }
        }
        System.out.println("프로그램 종료");
    }
}
