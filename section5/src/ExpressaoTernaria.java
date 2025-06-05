import java.util.Scanner;

public class ExpressaoTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = 52.23;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Desconto aplicado de R$ %.2f%n", desconto);

        sc.close();
    }
}
