public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    public void adicionarEstoque(int num) {
        quantidadeEstoque += num;
    }

    public void venderEstoque(int num) {
        quantidadeEstoque -= num;
    }
}