package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
/*
Given five positive integers, find the minimum and maximum
values that can be calculated by summing exactly four of the
five integers. Then print the respective minimum and maximum
values as a single line of two space-separated long integers.
 */
public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> sortedList = arr.stream().sorted().collect(toList());
        System.out.println(sortedList.stream()
                .limit(4)
                .mapToLong(Integer::longValue).sum()+" " + sortedList.stream()
                .skip(1)
                .mapToLong(Integer::longValue)
                .sum());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        miniMaxSum(arr);
        bufferedReader.close();
    }
}
