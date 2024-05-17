import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Pedindo dados do usuario
        System.out.println("Ola, digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero_conta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        float saldo_conta = scanner.nextFloat();

        // Exibindo dados
        System.out.println("Olá "+nome+",obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", " +
                "conta: "+numero_conta+" e seu saldo: "+saldo_conta+" já está disponível para saque");

        // Seria bom eu colocar umas condiçoes para o codigo n poder ser burlado, dps dar uma att nele
    }
}
