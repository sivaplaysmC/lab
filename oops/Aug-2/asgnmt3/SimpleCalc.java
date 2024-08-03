
/*
 * Write a Code to Perform simple calculator operations by getting 2 numbers from users.
[addition,subtraction,multiplication,division,Quotient,Remainder]
 */
import java.util.Scanner;

public class SimpleCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();

    System.out.printf("a + b = %d\n", a + b);
    System.out.printf("a - b = %d\n", a - b);
    System.out.printf("a * b = %d\n", a * b);
    System.out.printf("a / b = %d\n", a / b);
    System.out.printf("a %% b = %d\n", a % b);
  }
}
