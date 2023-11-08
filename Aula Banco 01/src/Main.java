import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in); // Para strings
        Scanner sc2 = new Scanner(System.in); // Para números
        Cidade cidade1 = new Cidade();

        System.out.print("Digite o id da cidade: ");
        cidade1.setIdCidade(sc2.nextInt());
        System.out.print("Digite o nome da cidade: ");
        cidade1.setNomeCidade(sc1.nextLine());
        System.out.print("Digite a sigla do estado: ");
        cidade1.setEstado(sc1.nextLine());

        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.adiciona(cidade1);
    }
}