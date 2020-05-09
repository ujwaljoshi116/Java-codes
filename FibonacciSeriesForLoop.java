package Loops;
import java.util.Scanner;
public class FibonacciSeriesForLoop {
    public static void main(String[] args) {
//        Fibonacci Series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
//        Take user input
        int num = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a+ " ");
        System.out.println(b+ " ");
//         main code
        for(int i=0;i < num-2 ; i++ ){
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
