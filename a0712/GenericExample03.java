package a0712;

public class GenericExample03 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        Car1Agency car1Agency = new Car1Agency();
        Car1 car1 = car1Agency.rent();
        car1.run();
    }
}
