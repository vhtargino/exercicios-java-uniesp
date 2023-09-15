import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.print("Digite seu nome: ");
        p1.setNome(sc.nextLine());

        System.out.print("Digite seu peso em kg (ex.: 80): ");
        p1.setPeso(sc.nextDouble());

        System.out.print("Digite sua altura em metros (ex.: 1,70): ");
        p1.setAltura(sc.nextDouble());

        p1.calcularIMC();
        System.out.printf("%s, seu IMC é de: %.2f ", p1.getNome(), p1.calcularIMC());
    }
}