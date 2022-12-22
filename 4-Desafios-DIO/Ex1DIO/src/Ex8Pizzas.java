import java.util.Scanner;

public class Ex8Pizzas {
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    double T, N, X;

    T = scanner.nextDouble();
    N = scanner.nextDouble();
    X = scanner.nextDouble();
    scanner.close();

    double pizzas = (N * X) / SLICE;
    int piz = (int)Math.ceil(pizzas);
    System.out.println(piz);
    }
}