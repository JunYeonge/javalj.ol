package a0706;

public class Phone2 {
    public String model;
    public String color;
    public int weight;
    //기본 생성자 선언
    public Phone2(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone2(String model, String color) 생성자 실행됨");
    }
}
