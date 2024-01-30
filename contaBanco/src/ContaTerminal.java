import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = 0;
        while (true) {
            try {
                numeroConta = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Formato inválido. Digite o número da conta novamente:");
                scanner.nextLine(); 
            }
        }
        scanner.nextLine(); 

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldoConta = 0;
        while (true) {
            try {
                String inputSaldo = scanner.nextLine();
                inputSaldo = inputSaldo.replace(",", "."); // Substitui ',' por '.' se necessário
                saldoConta = Double.parseDouble(inputSaldo);
                break;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Formato inválido. Digite o saldo novamente:");
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

        scanner.close();
    }
}
