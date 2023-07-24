package a0705;

public class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Food("치킨", 19800);
        Food pizza = new Food("피자", 29700);

        System.out.printf("Food { name: %s, price: %d원} \n", chicken.getName(), chicken.getPrice());
        System.out.printf("Food { name: %s, price: %d원} \n", pizza.getName(), pizza.getPrice());
    }
}

class Food {
    String Name;
    int Price;

    public Food(String name, int price) {
        Name = name;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }
    
}