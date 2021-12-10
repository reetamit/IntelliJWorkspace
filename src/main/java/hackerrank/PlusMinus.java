package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
Given an array of integers, calculate the ratios of its elements that are positive,
negative, and zero. Print the decimal value of each fraction on a new line with
places after the decimal.
 */
public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        Float positive=0.000000f,negetive=0.000000f,zero=0.000000f;
        int n = arr.size();
        for (Integer integer : arr) {
            if(integer>0)
                positive ++;
            else if(integer==0)
                zero++;
            else
                negetive++;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(positive/n));
        System.out.println(df.format(negetive/n));
        System.out.println(df.format(zero/n));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        plusMinus(arr);
        bufferedReader.close();
    }
}