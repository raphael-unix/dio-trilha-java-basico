import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta!");
        int numero          = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia      = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente!");
        String nomeCliente  = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " +agencia+", conta "+ numero );
        System.out.println("e seu saldo " +saldo+ " já está disponível para saque.");

    }
}