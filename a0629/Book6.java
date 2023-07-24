package a0629;

public class Book6 {
    public static void main(String[] args) {
        while(true){
            int i = (int)(Math.random()*6) +1;
            int y = (int)(Math.random()*6) +1;
            
            int sum = i + y;
            
            System.out.println("(" + i + ","  + y + ")");
            
            if( sum == 5) {
                break;
            }
        }
    }
}
