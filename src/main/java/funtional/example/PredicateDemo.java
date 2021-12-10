package funtional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> i = (t) -> {
            if(t%2 ==0)
                return true;
            else
                return false;
        };

        System.out.println(i.test(4));
        System.out.println(i.test(7));

        List<Integer> listI= Arrays.asList(1,2,3,4,5);
        //List only even numbers
        listI.stream().filter(i).forEach(t-> System.out.println("Printing even" + t));
    }
}
