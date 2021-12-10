package stream.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public  static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"John","IT",60000));
        list.add(new Employee(102,"Bob","Finance",80000));
        list.add(new Employee(103,"Dan","Call Center",40000));
        list.add(new Employee(104,"Mac","IT",65000));
        list.add(new Employee(105,"Sam","IT",70000));
        list.add(new Employee(106,"Kyle","HR",56000));

        return list;
    }
}
