import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(126,-1,-34,12,121,-5,2,-4,123,45,45,78,125);
        int secondMax = SecondHighest(list);
        System.out.println(secondMax);
    }

    public static Integer SecondHighest(List<Integer> list) {
        int max = 0;
        int secondMax = 0;

       for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i) > max) {
                secondMax=max;
                max = list.get(i);
            }else if(secondMax<max && list.get(i)>secondMax)
                secondMax= list.get(i);
        }
        return secondMax;
    }
}

