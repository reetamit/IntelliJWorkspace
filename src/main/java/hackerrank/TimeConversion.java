package hackerrank;

import java.io.*;

/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */
public class TimeConversion {

    public static String timeConversion(String str) {
// Get hours
        int h1 = (int)str.charAt(1) - '0';
        int h2 = (int)str.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        // If time is in "AM"
        if (str.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
        // If time is in "PM"
        else
        {
            if (hh == 12)
            {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
            else
            {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                    System.out.print(str.charAt(i));
            }
        }
        return "blabla";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();
        String result = timeConversion(s);
        //bufferedWriter.write(result);
       // bufferedWriter.newLine();
        bufferedReader.close();
       // bufferedWriter.close();
    }
}
