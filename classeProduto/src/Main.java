import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in).useLocale(Locale.US);
        Scanner sc2 = new Scanner(System.in).useLocale(Locale.US);
        Produto p1 = new Produto();

        System.out.print("Nome do produto: ");
        p1.nome = sc1.nextLine();

        System.out.print("Preço do produto: ");
        p1.preco = sc2.nextDouble();

        System.out.print("Quantidade do produto: ");
        p1.quantidadeEstoque = sc2.nextInt();

        System.out.print("Produto: " + p1.nome + ", Preço: R$" + p1.preco + ", Quantidade: " + p1.quantidadeEstoque);

        System.out.print("\nQuanto você quer adicionar ao estoque? Digite ao lado: ");
        int adicionar = sc2.nextInt();
        p1.adicionarEstoque(adicionar);

        System.out.print("Produto: " + p1.nome + ", Preço: R$" + p1.preco + ", Quantidade: " + p1.quantidadeEstoque);

        System.out.print("\nQuanto você vendeu? Digite ao lado: ");
        int vender = sc2.nextInt();
        p1.venderEstoque(vender);

        System.out.print("Produto: " + p1.nome + ", Preço: R$" + p1.preco + ", Quantidade: " + p1.quantidadeEstoque);
    }
}