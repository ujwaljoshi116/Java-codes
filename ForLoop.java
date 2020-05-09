package Loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

//        Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact =1;
        for (int i =1; i <= num;i++ ){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num +" = "+fact);
    }
}
