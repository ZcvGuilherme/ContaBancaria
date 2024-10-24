import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;
        while (true) { 
            System.out.println("Digite o número da agência: ");
            String leitor = scanner.nextLine();
            if (leitor.equals(agencia)){
                System.out.println("Acesso Garantido.");
                System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numero, saldo);
                break;
            }  
            else System.err.println("Acesso negado!");

        }
        scanner.close();

    }
}
