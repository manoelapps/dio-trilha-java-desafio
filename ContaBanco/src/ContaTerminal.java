import java.util.Scanner;
import java.util.Locale;;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Banco DIO! Para trazer sua conta para nosso Banco siga os passos a seguir:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Primeiro digite o seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a Agencia Desejada: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Qual saldo para depósito? ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por trazer sua conta para o Banco DIO, sua agência é " + agencia +", conta " + conta + " e seu saldo R$ " + saldo + ", já está disponível para saque!");
        
    }
       
}
