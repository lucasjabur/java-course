import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas são agora?");
        System.out.print("Horas: ");
        hora = sc.nextInt();

        if (hora < 12 && hora >= 5) {
        System.out.println("Bom dia, usuário!");
        }

        else if (hora >= 12 && hora < 19) {
            System.out.println("Boa tarde, usuário!");
        }

        else if ((hora >= 19 && hora < 24) || (hora >= 0 && hora < 5)) {
            System.out.println("Boa noite, usuário!");
        }

        else {
            System.out.println("Entre com horas válidas!");
        }

        sc.close();
        
    }
}
