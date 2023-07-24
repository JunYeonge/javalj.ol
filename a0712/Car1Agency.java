package a0712;

public class Car1Agency implements Rentable<Car1>{
    public Car rent() {
        return new Car();
    }
}
//CarAgency, HomeAgency는
