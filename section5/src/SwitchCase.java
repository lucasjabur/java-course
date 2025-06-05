import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.print("Entre com o dia da semana: ");        
        dia = sc.nextLine();

        switch (dia) {
            case "domingo":
                System.out.println("Bom domingo!");
                break;
            case "segunda":
                System.out.println("Boa segunda!");
                break;
            case "treça":
                System.out.println("Boa terça!");
                break;
            case "quarta":
                System.out.println("Boa quarta!");
                break;
            case "quinta":
                System.out.println("Boa quinta!");
                break;
            case "sexta":
                System.out.println("Boa sexta!");
                break;
            case "sábado":
                System.out.println("Bom sábado!");
                break;
        }

        sc.close();
    }
}
