package funtional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Hi this is Reetam";
        };
        //System.out.println(supplier.get());

        List<String> listI= Arrays.asList();//"ABC","EFG","PQR");
        //Example of get()
        System.out.println(listI.stream().findAny().orElseGet(()->"Match not found"));

    }
}
