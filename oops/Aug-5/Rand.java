import java.util.Scanner;

public class Rand {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rand = 7;
    int input = 0;
    do {
      System.out.println("guess a number");
      input = sc.nextInt();
      if (input > rand)
        System.out.println("Too big");
      if (input < rand)
        System.out.println("Too small");
    } while (input != rand);
    System.out.println("Correct guess");
    System.out.printf("the number is %d\n", rand);
  }
}
