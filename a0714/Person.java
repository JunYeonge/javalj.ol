package a0714;

public class Person {
    public void action(Workable workable) {
        workable.work();
    }

    public void action1(Object object) {
    }

    //action 메소드 정의
    // 이 메소드는 Workable  인터페이스에서 매개변수로 받아서
    // workavle 객체의 work 메소드를 호출
    // action 메소드는 매개변수로 전달된 workable 객체의
    // work 메소드를 실행
}
