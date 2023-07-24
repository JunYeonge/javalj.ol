package a0714;

public class LambdaExample4 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();

        //실행문이 두 개 이상일 경우
        person2.action((x, y) -> {
            double result = x + y;
            return result;
        });

        person2.action((x, y) -> (x + y));

        person2.action((x, y) -> sum(x, y));
    }
        public static double sum(double x, double y) {
            return( x + y);
        }
    }

