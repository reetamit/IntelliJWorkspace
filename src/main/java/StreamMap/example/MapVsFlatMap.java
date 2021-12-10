package StreamMap.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customerList = CustomerDAO.getAll();

        //Map or data transformation for one to one mapping
        List<String> emails = customerList.stream()
                .map(Customer::getEmail)
                .collect(Collectors.toList());
        System.out.println(emails);

        List<String> customerPhone = customerList.stream()
                .flatMap(c->c.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(customerPhone);
    }
}
