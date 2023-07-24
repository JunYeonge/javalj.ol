package a0714;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person5 person5 = new Person5();

        Member1 m1 = person5.getMember2(Member1 :: new);
        //Member :: new 는 create 메소드가 요구하는
        // 생성자를 참조하여 새로운 Member 객체를 생성하는 역할
        System.out.println(m1);
        System.out.println();

        Member1 m2 = person5.getMember3(Member1 :: new);
        System.out.println(m2);


    }
}
