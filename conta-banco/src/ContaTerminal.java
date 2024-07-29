import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpa o buffer do scanner
        scanner.nextLine();  

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem com os dados inseridos
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", 
                          nomeCliente, agencia, numero, saldo);

        // Fechar o scanner
        scanner.close();
    }
}