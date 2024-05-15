import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine(); 

        System.out.println("Por favor, digite a Agência:");
        String agencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt(); 

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat( " conta ") + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}