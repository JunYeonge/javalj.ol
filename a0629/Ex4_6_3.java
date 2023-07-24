package a0629;

public class Ex4_6_3 {
    public static void main(String[] args) {
        int sum = 0;

        for( int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        // System.out.println(sum);
        System.out.printf("1부터 100까지 합계는 %d%n",sum);
    }
}
