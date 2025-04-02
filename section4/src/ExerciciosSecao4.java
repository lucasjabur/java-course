import java.util.Scanner;

public class ExerciciosSecao4 {
    public static void main(String[] args) {
        System.out.println("======== Exercício 01 ========");

        int valor1, valor2, soma;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com um valor: ");
        valor1 = sc.nextInt();
        
        System.out.print("Entre com outro valor: ");
        valor2 = sc.nextInt();

        soma = valor1 + valor2;

        System.out.printf("Soma dos valores inseridos: %d%n", soma);

        System.out.println("==============================");

        System.out.println("\n======== Exercício 02 ========");

        double pi = 3.14159;
        double raio, area;

        System.out.print("Entre com o raio de uma circunferência: ");
        raio = sc.nextDouble();

        area = pi*Math.pow(raio, 2);

        System.out.printf("A área da circunferência é: %.4f%n", area);

        System.out.println("==============================");

        System.out.println("\n======== Exercício 03 ========");

        int A, B, C, D, diferenca;

        System.out.println("Entre com 4 valores seguidos: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.printf("A diferenca é: %d%n", diferenca);

        System.out.println("==============================");

        System.out.println("\n======== Exercício 04 ========");

        int nroFuncionario, nroHoras;
        double valorPorHora, salario;

        System.out.print("Entre com o número do funcionário: ");
        nroFuncionario = sc.nextInt();

        System.out.print("Entre com o número de horas trabalhadas: ");
        nroHoras = sc.nextInt();

        System.out.print("Entre com o valor da hora trabalhada: ");
        valorPorHora = sc.nextDouble();

        salario = valorPorHora * nroHoras;

        System.out.printf("Número do funcionário: %d%n", nroFuncionario);
        System.out.printf("Salário do funcionário: US$ %.2f%n", salario);

        System.out.println("==============================");

        System.out.println("\n======== Exercício 05 ========");

        int codPeca1, nroPecas1, codPeca2, nroPecas2;
        double valorUnit1, valorUnit2, valorTotal;
        
        System.out.println("Entre com o código da peça 1, o números de peças e o seu valor unitário");
        codPeca1 = sc.nextInt();
        nroPecas1 = sc.nextInt();
        valorUnit1 = sc.nextDouble();

        System.out.println("Entre com o código da peça 2, o números de peças e o seu valor unitário");
        codPeca2 = sc.nextInt();
        nroPecas2 = sc.nextInt();
        valorUnit2 = sc.nextDouble();

        valorTotal = (nroPecas1 * valorUnit1) + (nroPecas2 * valorUnit2);

        System.out.printf("O valor total da compra é: US$ %.2f%n", valorTotal);

        System.out.println("==============================");

        System.out.println("\n======== Exercício 06 ========");

        double valA, valB, valC, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.println("Entre com 3 valores seguidos: ");
        valA = sc.nextDouble();
        valB = sc.nextDouble();
        valC = sc.nextDouble();

        areaTriangulo = (valA * valC) / 2;
        areaCirculo = pi * Math.pow(valC, 2);
        areaTrapezio = ((valA + valB) * valC) / 2;
        areaQuadrado = Math.pow(valB, 2);
        areaRetangulo = valA * valB;

        System.out.printf("Triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Círculo: %.3f%n", areaCirculo);
        System.out.printf("Trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retângulo: %.3f%n", areaRetangulo);

        System.out.println("==============================");

        sc.close();
    }
}
