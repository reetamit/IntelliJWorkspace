package stream.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(){
        return EmployeeDAO.getEmployees().stream().filter(emp->emp.getSalary()>50000).collect((Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers());
        System.out.println(evaluateTaxUsers().stream().sorted((o1,o2)-> o1.getName().compareTo(o2.getName())).collect(Collectors.toList()));
        evaluateTaxUsers().stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
        evaluateTaxUsers().stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(4,"a");
        map.put(2,"b");
        map.put(5,"c");
        map.put(1,"d");
        map.put(6,"e");
        map.put(3,"f");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(176,"Roshan","IT",600000),100);
        employeeMap.put(new Employee(388,"Bikash","CIVIL",900000),101);
        employeeMap.put(new Employee(470,"Joy","DEFENCE",100000),102);
        employeeMap.put(new Employee(624,"Reetam","CORE",300000),103);
        employeeMap.put(new Employee(284,"Kamal","SOCIAL",500000),104);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
    }
}
