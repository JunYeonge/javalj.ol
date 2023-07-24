package a0712;

public class GenericExample01 {
    public static void main(String[] args) {
        
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println("product1의 kind : " + tv);
        System.out.println("product1의 model : " + tvModel);
        
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel1 = product2.getModel();
        System.out.println("product2의 kind : " + car);
        System.out.println("product2의 model : " + carModel1);

        
        
    }
}

//main 메서드에서는 두개의 product 객체를 생성하고 사용하는 예제가 제시되어 있다.
//1. Product 객체 product1은 Tv와 String 타입 매개변수로 지정하여 생성되었다
//product1, setKind(new Tv())를 통해 kind에는 Tv객체가
//product1,1setModel(스마트Tv)를 통해 model에는 "스마트Tv" 문자열이 저장
//product1.getKind()를 호출하면 Tv 객체가 반환
//product1.getModel()를 호출하면 "스마트Tv" 문자열이 반환된다.

//2. product객체 product2도 마찬가지로 Car와 String을 타입매개변수로 지정하여 생성되었다. product2, setKind(new Car())를 통해 kind에는 Car 객체가, product2.setModel("SUV자동차")을 통해 model에는 "SUV자동차" 문자열이 저장되었다. 이후 product2.getKind()를 호출하면 Car 객체가 반환되고, product2.getModel()을 호출하면 "SUV자동차" 문자열이 반환된다.

//제네릭을 사용하면 Product 클래스에서 다양한 종류의 제품을 다룰 수 있으며, 타입 안정성과 코드 재사용성을 높일 수 있다.
