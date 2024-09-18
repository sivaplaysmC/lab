import java.util.Scanner;
import java.lang.Character;

public class Capitalize {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      System.out.printf("%s ", capitalize(sc.next()));
    }
    System.out.println();

  }

  private static String capitalize(String str) {
    str = str.toLowerCase();
    if (str.length() < 3) {
      return str;
    }

    String res = Character.toUpperCase(str.charAt(0)) + str.substring(1);
    return res;

  }

}
