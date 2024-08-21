import java.util.Scanner;

public class BillGen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String type = sc.next();
    // int count = sc.nextInt();
    int count = 1;
    int cost = 0;
    int discountPercent = 0;

    System.out.println(type.equals("Regular"));
    System.out.println("Regular".length());

    System.out.println(type == "Regular");

    switch (type) {
      case "Regular":
        cost = 50;
        discountPercent = count > 10 ? 10 : 0;
        break;
      case "VIP":
        cost = 100;
        discountPercent = count > 5 ? 15 : 0;
        break;
      case "Premium":
        cost = 150;
        discountPercent = count > 3 ? 20 : 0;
        break;
      default:
        System.out.println("Wrong ticket type");
        System.exit(1);
        break;
    }

    float totalCost = cost * count;
    totalCost += totalCost < 200 ? 20 : 0;
    totalCost -= totalCost * discountPercent / 100;

    System.out.printf("%.1f\n", totalCost);
  }
}
