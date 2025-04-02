import java.util.Scanner;

public class LendoDados {
    public static void main(String[] args) {

        int num;
        String palavra, frase;
        char caractere;

        Scanner sc = new Scanner(System.in); // estrutura: NomeDaClasse nomeDaInstancia = new NomeDaClasse(parametroDaClasse);
        // aqui eu estou criando uma nova instância da classe Scanner;

        System.out.print("Entre com um valor: ");
        num = sc.nextInt();

        System.out.printf("O número inserido foi: %d%n", num);

        System.out.print("Entre com uma palavra: ");
        palavra = sc.next();

        System.out.println("A palavra inserida foi: " + palavra);

        System.out.print("Entre com outra palavra: ");
        caractere = sc.next().charAt(0);

        System.out.println("O primeiro caractere da nova palavra é: " + caractere);

        sc.nextLine(); // utilizar um "sc.nextLine()" antes de fazer a leitura de uma frase faz com que a quebra de linha pendente do envio da leitura anterior seja
        // executada aqui. Caso contrário, o próximo "sc.nextLine" receberia essa quebra de linha e não haveria a leitura da frase.

        System.out.print("Entre com uma frase: ");
        frase = sc.nextLine();

        System.out.println("A frase inserida foi: " + frase);

        sc.close();
    }
}
