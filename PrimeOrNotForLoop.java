package Loops;
import java.util.Scanner;

public class PrimeOrNotForLoop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = sc.nextInt();
//
//        boolean Prime = true;
//
//        for(int i = 2;i * i <= num;i++){
//            if(num  % i ==0){
//                Prime = false;
//                break;
//            }
//        }
//        if (num < 2) {
//            Prime = false;
//        }
//
//        System.out.println("The number is Prime" + Prime);
//
//
//    }
      public static void main(String[] args) {
//          Taking user input
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number:");

          int num = sc.nextInt();
//           Giving a boolean satement to check if condition is true or false.
          boolean Prime = false;

          for(int i = 2; i * i <= num ;i++){
        // condition for non-prime number
        if(num % i == 0) {
            Prime = true;
            break;
        }
    }

    if (!Prime)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
}
}

