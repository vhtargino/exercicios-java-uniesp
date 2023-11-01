import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoas cp = new CadastroPessoas();

        boolean flag = true;

        while (flag) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Pessoa Física");
            System.out.println("2. Cadastrar Pessoa Jurídica");
            System.out.println("3. Listar Pessoas");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPessoa(cp, new PessoaFisica(), scanner);
                    flag = true;
                    break;
                case 2:
                    cadastrarPessoa(cp, new PessoaJuridica(), scanner);
                    flag = true;
                    break;
                case 3:
                    cp.listar();
                    flag = true;
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastrarPessoa(CadastroPessoas cp, Pessoa pessoa, Scanner scanner) {
        System.out.print("Digite o nome da pessoa: ");
        pessoa.setNome(scanner.nextLine());
        System.out.print("Digite a idade da pessoa: ");
        pessoa.setIdade(scanner.nextInt());
        scanner.nextLine();
        if (pessoa instanceof PessoaJuridica) {
            System.out.print("Digite o CNPJ: ");
            ((PessoaJuridica) pessoa).setCnpj(scanner.next());
        }
        cp.cadastrarPessoa(pessoa);
    }
}