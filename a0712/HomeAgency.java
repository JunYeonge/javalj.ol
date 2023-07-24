package a0712;

public class HomeAgency implements Rentable<Home>{
    public Home rent() {
        return new Home();
    }
}
//HomeAgency의 rent 메서드르 호출하여 Home 객체를얻고, 이후 turnOnLight() 메서드를 호출하여 전등을 켭니다.

//Car1Agency의 rent 메서드르 호출하여 Car1 객체를얻고, 이후 run() 메서드를 호출하여 자동차가 달립니다.