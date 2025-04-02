public class FuncoesMatematicas {
    public static void main(String[] args) {
        double num1 = 9.0;
        double num2 = 5.0;
        double num3 = -7.0;
        double A, B, C;
        
        A = Math.sqrt(num1);
        B = Math.pow(num2, 2);
        C = Math.abs(num3);

        System.out.printf("A raiz quadrada de %.2f é: %.2f%n", num1, A);
        System.out.printf("%.2f elevado ao quadrado é: %.2f%n", num2, B);
        System.out.printf("O valor absoluto de %.2f é: %.2f%n", num3, C);

    }    
}
