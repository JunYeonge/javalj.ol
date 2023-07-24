package a0705;

import java.util.Scanner;

public class QZ_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요. >");
        
        int n = scan.nextInt();

        if( 30<= n && n <=40){
            if(60 <= n && n <=70){
                System.out.println("win");
            }else{
            System.out.println("lose");
        }
        System.out.println();
    } 
}
}
