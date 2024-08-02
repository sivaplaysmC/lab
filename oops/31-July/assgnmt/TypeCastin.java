public class TypeCastin {
  public static void main(String[] args) {
    int i = 10;
    float f = i; // automatic type casting (widening conversion)

    int j = (int) f; // manual type casting (narrowing conversion);
    // int j = f; error: cannot convert float to int

    System.out.println(i);
    System.out.println(f);
    System.out.println(j);

  }
}
