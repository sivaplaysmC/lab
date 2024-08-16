import java.util.Scanner;

public class CentToDollars {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cents = sc.nextInt();
    System.out.printf("%.02f\n", cents / 100.0f);
  }
}
