package a0717.Function177;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Stream1 {
    public static void main(String[] args) {
        int[] data = {5,6,4,2,3,1,1,2,2,4,8};

        //짝수만 포함하는 ArrayList생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i = 0; i<data.length; i++) {
            if(data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        //Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        //Set을 다시 List로 변경
        ArrayList<Integer> distincList = new ArrayList<>(dataSet);

        //역순으로 정렬
        distincList.sort(Comparator.reverseOrder());

        // Integer 리스트를 정수 배열로 반환
        int[] result = new int[distincList.size()];
        for(int i = 0; i < distincList.size(); i++) {
            result[i] = distincList.get(i);
        }
        for(int num : result) {
            System.out.println(num);
        }
    }
}
