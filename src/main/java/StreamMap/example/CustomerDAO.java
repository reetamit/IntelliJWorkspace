package StreamMap.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101,"John","john@gmail.com", Arrays.asList("123456","987654")),
                new Customer(102,"Don","don@gmail.com", Arrays.asList("345678","234456")),
                new Customer(103,"Bob","bob@gmail.com", Arrays.asList("654234","776433")),
                new Customer(104,"Mike","mike@gmail.com", Arrays.asList("987456","654456")),
                new Customer(105,"Dan","dan@gmail.com", Arrays.asList("234567","986543"))
        ).collect(Collectors.toList());
    }
}
