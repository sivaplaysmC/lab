import java.util.Scanner;

/**
 * DoWhile
 */
public class DoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 0;
    int shouldContinue = 1;
    do {
      System.out.println("enter a number");
      num += scanner.nextInt();
      System.out.println("press 0 to stop, other value to continue");
      shouldContinue = scanner.nextInt();
    } while (shouldContinue != 0);
    System.out.println(num);
  }
}
