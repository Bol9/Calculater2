package soon;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Operation");
        String enterdStr = scanner.next();

        SplitTo3Part splitTo3Part = new SplitTo3Part();
        String[] readySplit = splitTo3Part.splitTo3Part(enterdStr);

        Operation operation = new Operation();
        operation.operation(readySplit);


    }
}
