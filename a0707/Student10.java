package a0707;

public class Student10 extends Person10{
    //필드선언

    public int studentNo;

    //생성자 선언
    public Student10(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    //메소드 선언
    public void study() {
        System.out.println("공부를 합니다.");
    }
}
