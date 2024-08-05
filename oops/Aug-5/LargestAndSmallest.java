import java.util.Scanner;

/**
 * LargestAndSmallest
 */
public class LargestAndSmallest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int minn = Integer.MAX_VALUE;
    int maxx = Integer.MIN_VALUE;

    int shouldContinue = 0;

    do {
      System.out.println("enter a number");
      int num = sc.nextInt();
      minn = Math.min(minn, num);
      maxx = Math.max(maxx, num);
      System.out.println("enter 0 to stop");
      shouldContinue = sc.nextInt();
    } while (shouldContinue != 0);
    System.out.printf("Min: %d\nMax: %d\n", minn, maxx);
  }
}
