import stream.example.Employee;
import stream.example.EmployeeDAO;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,7,8,1,5,9);
        List<String> words = Arrays.asList("corejava","spring","hibernate");

        int sum = numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum);

        int reducemultiply= numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println(reducemultiply);

        int maxValue= numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(maxValue);

        String lString= words.stream()
                .reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println(lString);

        double avgEmpSal=EmployeeDAO.getEmployees().stream()
                .filter(emp->emp.getDept().equalsIgnoreCase("IT"))
                .map(Employee::getSalary)
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println(avgEmpSal);
    }
}
