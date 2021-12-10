import java.util.ArrayList;

public class Java8Features {

    public static void main(String[] args) {

        // 1. foreach iterator
        ArrayList<Integer> intlist = new ArrayList<>();
        for(int i =0; i<100 ; i++) {
            intlist.add(i);
        }
        intlist.forEach(output -> System.out.println("Numbers:"+output));

        // 2. Default and static methods in interface
        FunctionI dummyInterface = Integer::sum;//Function interface call with method reference or other options below
        /*FunctionI dummyInterface = (number1,number2) -> {
            return (number1+number2);
        };*/
       // FunctionI dummyInterface = (number1,number2) -> (number1+number2);
        int sum=dummyInterface.add2numbers(43,57);
        System.out.println("The total is :"+sum);
        dummyInterface.displayString("Reetam"); //Default method call
        FunctionI.printmsg(); //Static method call

        //3. Java stream API

    }
}

@FunctionalInterface
interface FunctionI{
    int add2numbers(int number1,int number2);

    default void displayString(String display) //We can write multiple default method
    {
        System.out.println("Hello"+display);
    }

    static void printmsg(){ //We can write multiple static method
        System.out.println("Printing one message.");
    }
}
