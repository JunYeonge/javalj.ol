package a0704_1;

// import java.text.DecimalFormat;
import java.util.Scanner;

public class QZ_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("년도를 입력해주세요>");
        int yy = scan.nextInt();
        System.out.println("월 을 입력해주세요>");
        int mm = scan.nextInt();
        System.out.println("일을 입력해주세요>");
        int dd = scan.nextInt();

        System.out.printf("%d",yy);
        System.out.printf(".");
        System.out.printf("%2d",mm);
        System.out.printf(".");
        System.out.printf("%2d",dd);
    }
}
