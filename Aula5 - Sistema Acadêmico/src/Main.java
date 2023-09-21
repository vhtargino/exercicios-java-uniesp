import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in).useLocale(Locale.US);  // Para strings
        Scanner sc2 = new Scanner(System.in).useLocale(Locale.US);  // Para números

        String escolha;
        boolean flag = false;

        do {
            System.out.print("Cadastrar professor (1) ou aluno (2): ");
            escolha = sc2.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("CADASTRO DE PROFESSOR");
                    Professor prof1 = new Professor();
                    System.out.print("Digite seu nome: ");
                    prof1.setNome(sc1.nextLine());
                    System.out.print("Digite sua idade: ");
                    prof1.setIdade(sc2.nextInt());
                    System.out.print("Digite sua especialização: ");
                    prof1.setEspecializacao(sc1.nextLine());
                    System.out.print("Digite seu salário: ");
                    prof1.setSalario(sc2.nextDouble());
                    flag = true;
                    break;
                case "2":
                    System.out.println("CADASTRO DE ALUNO");
                    Aluno aluno1 = new Aluno();
                    System.out.print("Digite seu nome: ");
                    aluno1.setNome(sc1.nextLine());
                    System.out.print("Digite sua idade: ");
                    aluno1.setIdade(sc2.nextInt());
                    System.out.print("Digite sua primeira nota: ");
                    aluno1.setNota1(sc2.nextDouble());
                    System.out.print("Digite sua segunda nota: ");
                    aluno1.setNota2(sc2.nextDouble());
                    aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2());
                    System.out.println("Média: " + aluno1.getMedia());
                    flag = true;
                    break;
                default:
                    System.out.println("Inválido. Escolha 1 ou 2.");
                    flag = false;
                    break;
            }
        } while(flag == false);
    }
}
