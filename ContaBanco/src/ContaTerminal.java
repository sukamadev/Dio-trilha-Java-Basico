//Importat as classes Locale e Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibindo mensagem de boas-vindas
        System.out.println("Seja bem-vindo ao nosso banco!".toUpperCase());
        System.out.println("______Criando sua conta________");

        //Obtendo dados do cliente
        System.out.println("Por favor, Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Número de conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agência:");
        String agencia = scanner.next();

        System.out.println("Valor do 1º depósito: ");
        double saldo = scanner.nextDouble();

        //Exibindo mensagem de conta criada
        System.out.println("Olá, " + nome + " " + sobrenome + "!");
        System.out.println("Obrigado por criar uma conta no nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já disponível para saque.");


    }
}
