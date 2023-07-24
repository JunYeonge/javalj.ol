package a0703;

import java.util.Scanner;

public class QZ_1 {
    public static void main(String[] args) {
        
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int yy = 0;
        int[] dd = null;

        while(run) {
            if(yy /4 ==0 && yy /100 !=0) {
                yy = scanner.nextInt();
                dd = new int[yy];
                System.out.println("1");
            } else if(yy / 100 ==0 && yy / 400 !=0) {
                System.out.println("0");
            } else if(yy / 400 ==0) {
                System.out.println("1");
            }else{
                run = false;
            }
            System.out.println("입력하신 년도는 :" + yy);
        }
        System.out.println("포로그램 종료");
    }
}
