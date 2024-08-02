public class UnaryOperator {
  public static void main(String[] args) {
    int i = 10;
    System.out.println(String.format("i: %d", i));
    System.out.println(String.format("i++: %d", i++));
    System.out.println(String.format("i: %d", i));

    System.out.println(String.format("i: %d", i));
    System.out.println(String.format("++i: %d", ++i));
    System.out.println(String.format("i: %d", i));

    System.out.println(String.format("-i %d", -i));
    System.out.println(String.format("~i %d", ~i));

  }
}
