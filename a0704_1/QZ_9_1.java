package a0704_1;

import java.util.Scanner;

public class QZ_9_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int num = scan.nextInt();

        System.out.println("숫자를 입력해주세요.");


        if(num == 12 || num <=2) {
            System.out.println("winter");
        } else if(num>=3 && num <=5){
            System.out.println("spring");
        } else if(num >=6 && num <=8) {
            System.out.println("summer");
        }else if(num >=9 && num <= 11) {
            System.out.println("fall");
        }else{
            System.out.println("숫자를 다시 입력해주세요");
            return;
        }
        
    }
}
