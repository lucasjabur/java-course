public class Casting {
    public static void main(String[] args) {
        int num1, num2;
        double divisaoInteira, divisaoReal;

        num1 = 5;
        num2 = 2;

        divisaoInteira = num1 / num2; // divisão de números inteiros gera outro número inteiro, por mais que 'divisao' seja do tipo 'double'
        // nesse caso, o resultado de 5 / 2 = 2
        System.out.println("Divisão Inteira: " + divisaoInteira);
        divisaoReal = (double) num1 / num2; // aqui foi utilizado o processo de Casting, o qual é responsável por atribuir o tipo 'double' para a operação
        // assim, o resultado de 5 / 2 = 2.5
        System.out.println("Divisão Real: " + divisaoReal);

    }
}
