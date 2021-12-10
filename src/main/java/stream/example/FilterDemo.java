package stream.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class FilterDemo {

    public static void main(String[] args) {

        List<String> liststr = Arrays.asList("John","Mac","Don","Gorge","Gimmy","Jack");
        liststr.stream().filter(t->t.startsWith("J")).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.put(6,"f");

        map.entrySet().stream().filter(k->k.getKey()%2 == 0).forEach(System.out::println);

    }
}
