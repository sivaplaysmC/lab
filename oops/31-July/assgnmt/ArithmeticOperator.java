public class ArithmeticOperator {
  public static void main(String[] args) {
    int a = 10, b = 20;

    System.out.println(String.format("a + b: %d", a + b));
    System.out.println(String.format("a - b: %d", a - b));
    System.out.println(String.format("a * b: %d", a * b));
    System.out.println(String.format("a / b: %f", (float) a / b));
    System.out.println(String.format("a %% b: %d", a % b));

  }
}
