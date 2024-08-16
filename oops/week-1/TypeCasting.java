import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double score = sc.nextDouble();
    int a = (int) score;
    System.out.println(a);
  }
}
