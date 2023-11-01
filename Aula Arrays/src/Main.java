import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc1 = new Scanner(System.in); // Para strings
        Scanner sc2 = new Scanner(System.in); // Para números

        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        CadastroPessoas cp = new CadastroPessoas();

        System.out.print("Digite o nome da pessoa física a ser cadastrada: ");
        pf.setNome(sc1.nextLine());

        System.out.print("Digite a idade da pessoa física a ser cadastrada: ");
        pf.setIdade(sc2.nextInt());

        cp.cadastrarPessoa(pf);

        System.out.print("Digite o nome da pessoa jurídica a ser cadastrada: ");
        pj.setNome(sc1.nextLine());

        System.out.print("Digite o CNPJ da pessoa jurídica a ser cadastrada: ");
        pj.setCnpj(sc1.nextLine());

        cp.cadastrarPessoa(pj);

        cp.listar();
    }
}