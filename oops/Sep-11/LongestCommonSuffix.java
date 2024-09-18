import java.util.ArrayList;
import java.util.Scanner;

public class LongestCommonSuffix {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> strings = new ArrayList<String>();
    int count = sc.nextInt();

    for (int i = 0; i < count; i++)
      strings.add(sc.next());

    String result = solve(strings);
    System.out.println(result);

  }

  private static String solve(ArrayList<String> strings) {
    StringBuilder builder = new StringBuilder();

    String firstWord = strings.get(0);

    for (int i = 1; i <= firstWord.length(); i++) {
      char current = firstWord.charAt(firstWord.length() - i);
      boolean res = compareCharAtPos(strings, current, i);
      if (!res) {
        break;
      }
      builder.append(current);
    }

    return builder.reverse().toString();

  }

  private static boolean compareCharAtPos(ArrayList<String> strings, char current, int offset) {
    for (int j = 1; j < strings.size(); j++) {
      if (strings.get(j).charAt(strings.get(j).length() - offset) != current) {
        return false;
      }
    }
    return true;
  }

}
