public class ContaBancaria {
    String cliente;
    String numeroDaConta;
    double saldo = 0;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("Saldo insuficiente.");
        }
        else {
            saldo -= valor;
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if(valor > saldo) {
            System.out.println("Saldo insuficiente.");
        }
        else {
            sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public void dadosDaConta() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Saldo: R$" + saldo);
    }
}