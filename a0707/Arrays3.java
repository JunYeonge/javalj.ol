package a0707;


public class Arrays3 {
    public static void main(String[] args) {
        String arr[] = {"apple","orange","banana","pear","peach","melon"};
        Arrays.sort(arr);

        for(String i : arr) {
            System.out.println("[" + i + "]");
        }
    }
}

