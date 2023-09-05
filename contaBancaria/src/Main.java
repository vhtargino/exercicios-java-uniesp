import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        ContaBancaria c1 = new ContaBancaria();
        c1.cliente = "Cebolinha";
        c1.numeroDaConta = "1234";

        ContaBancaria c2 = new ContaBancaria();
        c2.cliente = "Cascão";
        c2.numeroDaConta = "5678";

        int opcao;
        double valor;

        do {
            System.out.print("""
                    ================================
                    Qual operação deseja realizar?

                    1. Consultar saldo
                    2. Depósito
                    3. Saque
                    4. Transferência
                    5. Dados da conta
                    0. Sair
                    ================================
                    
                    Digite a sua escolha:\s""");

            opcao = sc.nextInt();


            switch (opcao) {
                default:
                    System.out.println("\nInválido.\n");
                    break;
                case 1:
                    System.out.printf("\nSeu saldo é: R$" + c1.saldo);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("\nDigite quanto deseja depositar: R$");
                    valor = sc.nextDouble();
                    c1.depositar(valor);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("\nDigite quanto deseja sacar: R$");
                    valor = sc.nextDouble();
                    c1.sacar(valor);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("\nDigite quanto deseja transferir: R$");
                    valor = sc.nextDouble();
                    c1.transferir(c2, valor);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    c1.dadosDaConta();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("\nAté breve!");
                    break;
            }
        } while(opcao != 0);

        System.out.println("\nSaldo da conta 2: R$" + c2.saldo);
    }
}