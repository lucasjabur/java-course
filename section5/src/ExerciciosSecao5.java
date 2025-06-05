import java.util.Scanner;

public class ExerciciosSecao5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("\n======== Exercício 01 ========");

        // int numInt;

        // System.out.print("Entre com um número inteiro: ");
        // numInt = sc.nextInt();

        // if (numInt < 0) {
        //     System.out.println("O valor é negativo.");
        // } else {
        //     System.out.println("O valor é positivo.");
        // }

        // System.out.println("==============================");

        // System.out.println("\n======== Exercício 02 ========");

        // int num;

        // System.out.print("Entre com um número inteiro: ");
        // num = sc.nextInt();

        // if (num % 2 == 0) {
        //     System.out.println("O valor é par."); 
        // } else {
        //     System.out.println("O valor é impar.");
        // }

        // System.out.println("==============================");

        // System.out.println("\n======== Exercício 03 ========");

        // int A, B;

        // System.out.println("Entre com dois valores inteiros: ");
        // A = sc.nextInt();
        // B = sc.nextInt();

        // if (A % B == 0 || B % A == 0) {
        //     System.out.println("\nOs valores são múltiplos.");
        // } else {
        //     System.out.println("\nOs valores não são múltiplos.");
        // }

        // System.out.println("==============================");

        // System.out.println("\n======== Exercício 04 ========");

        // int horaInicial, horaFinal;

        // System.out.println("Entre com a hora inicial e a hora final do jogo, respectivamente: ");
        // horaInicial = sc.nextInt();
        // horaFinal = sc.nextInt();

        // if ((horaInicial < 24 && horaInicial >= 0) && (horaFinal < 24 && horaFinal >= 0)) {
        //     if (horaInicial == horaFinal) {
        //         System.out.println("O jogo durou 24 horas.");
        //     } else if (horaInicial > horaFinal) {
        //         int horaTotal = (24 - horaInicial) + horaFinal;
        //         System.out.printf("O jogo durou %d hora(s).%n", horaTotal);
        //     } else if (horaInicial < horaFinal) {
        //         int horaTotal = horaFinal - horaInicial;
        //         System.out.printf("O jogo durou %d hora(s).%n", horaTotal);
        //     }
        // } else {
        //     System.out.println("Entre com horas válidas!");
        // }

        // System.out.println("==============================");

        // System.out.println("\n======== Exercício 05 ========");

        // int codigo, quantidade;
        // double total;

        // System.out.println("Entre com o código de um item e a sua quantidade: ");
        // codigo = sc.nextInt();
        // quantidade = sc.nextInt();

        // switch (codigo) {
        //     case 1:
        //         total = quantidade * 4.0;
        //         System.out.printf("Total: R$ %.2f%n", total);
        //         break;
        //     case 2:
        //         total = quantidade * 4.5;
        //         System.out.printf("Total: R$ %.2f%n", total);
        //         break;
        //     case 3:
        //         total = quantidade * 5.0;
        //         System.out.printf("Total: R$ %.2f%n", total);
        //         break;
        //     case 4:
        //         total = quantidade * 2.0;
        //         System.out.printf("Total: R$ %.2f%n", total);
        //         break;
        //     case 5:
        //         total = quantidade * 1.5;
        //         System.out.printf("Total: R$ %.2f%n", total);
        //         break;
        //     default:
        //         throw new AssertionError();
        // }

        // System.out.println("==============================");

        // System.out.println("\n======== Exercício 06 ========");

        // double valor;
        
        // System.out.println("Entre com um valor entre 0 e 100: ");
        // valor = sc.nextDouble();

        // if (valor >= 0 && valor <= 100) {
        //     if (valor >= 0 && valor <= 25) {
        //         System.out.println("Intervalo [0,25]");
        //     } else if (valor > 25 && valor <= 50) {
        //         System.out.println("Intervalo (25,50] ");
        //     } else if (valor > 50 && valor <= 75) {
        //         System.out.println("Intervalo (50,75]");
        //     } else {
        //         System.out.println("Intervalo (75,100]");
        //     }
        // } else {
        //     System.out.println("Fora de intervalo!");
        // }

        // System.out.println("==============================");

        // System.out.println("\n======== Exercício 07 ========");

        // double coordX, coordY;

        // System.out.println("Entre com as coordenadas: ");
        // coordX = sc.nextDouble();
        // coordY = sc.nextDouble();

        // if (coordX > 0 && coordY > 0) {
        //     System.out.println("\nPonto se encontra em: Q1");
        // } else if (coordX > 0 && coordY < 0) {
        //     System.out.println("\nPonto se encontra em: Q4");
        // } else if (coordX < 0 && coordY > 0) {
        //     System.out.println("\nPonto se encontra em: Q2");
        // } else {
        //     System.out.println("\nPonto se encontra em: Q3");
        // }

        // System.out.println("==============================");

        System.out.println("\n======== Exercício 08 ========");

        double salario;

        System.out.println("Entre com o seu salário: ");
        salario = sc.nextDouble();

        if (salario > 0) {
            if (salario <= 2000.00) {
                System.out.println("Isento");
            } else if (salario >= 2000.01 && salario <= 3000.00) {
                double salarioNaoIsento = salario - 2000;
                double imposto = salarioNaoIsento*0.08;

                System.out.printf("Imposto: R$ %.2f%n", imposto);

            } else if (salario >= 3000.01 && salario <= 4500.00) {
                double salarioAcima2k = salario - 2000;
                double salarioAcima3k = salarioAcima2k - 1000;
                double imposto = (salarioAcima2k*0.08) + (salarioAcima3k*0.18);

                System.out.printf("Imposto: R$ %.2f%n", imposto);
            } else {
                double salarioAcima2k = salario - 2000;
                double salarioAcima3k = salarioAcima2k - 1000;
                double salarioAcima4Meiok = salarioAcima3k - 1500;
                double imposto = (salarioAcima2k*0.08) + (salarioAcima3k*0.18) + (salarioAcima4Meiok*0.28);

                System.out.printf("Imposto: R$ %.2f%n", imposto);
            }
        } else {
            System.out.println("Valor inválido!");
        }

        System.out.println("==============================");

        sc.close();
    }
}
