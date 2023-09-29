import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in).useLocale(Locale.US);  // Para strings
        Scanner sc2 = new Scanner(System.in).useLocale(Locale.US);  // Para números

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.print("Classe da arara: "); // Aves
        arara.setClasse(sc1.nextLine());
        System.out.print("Locomoção da arara: ");
        arara.setLocomocao(sc1.nextLine());
        System.out.print("Quantidade de ovos da arara: ");
        arara.setQtdDeOvos(sc2.nextInt());
        System.out.println();

        System.out.println("Informações do leão:");
        leao.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da arara:");
        System.out.println("Classe: " + arara.getClasse());
        System.out.println("Locomoção: " + arara.getLocomocao());
        System.out.println("Quantidade de ovos: " + arara.getQtdDeOvos());
    }
}
