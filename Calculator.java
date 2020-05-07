package SwitchStatements;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //To take user input,we use Scanner.

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First number:");
        float a = sc.nextInt();

        System.out.println("Enter Second number:");
        float b = sc.nextInt();

        System.out.println("Enter Operation(+,-,*,/)");
        sc.nextLine();
        //To take operators we use char.

        char Operation = sc.nextLine().charAt(0);

        //intial value is 0.
        float result = 0;
        //Switch Case code.
        switch (Operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("You have selected Invalid Operation!!!!!!!!!!!!!!!!!");


        }
        //To print the result.
        System.out.println("The result is " + result);


        
    }
}
