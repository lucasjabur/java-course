import java.util.Scanner;

public class AtribuicaoCumulativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos;

        System.out.print("Minutos consumidos: ");
        minutos = sc.nextInt();

        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", conta);

        sc.close();
    }
}
