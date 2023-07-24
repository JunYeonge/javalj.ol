package a0706;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("생년월일을 입력해주세요");
        int num = scan.nextInt();
        int male = scan.nextInt();
        int birth_year;
    
        if(male == 1 || male == 2) {
            birth_year = 1900 + num / 10000; 
        } else{
            birth_year = 2000 + num / 10000;
        }
        int age = 2023 - birth_year;
        System.out.println("나이 : " + age);
    }
}
