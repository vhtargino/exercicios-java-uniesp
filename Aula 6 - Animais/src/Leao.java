public class Leao extends Animal {
    private String pelo;

    // Construtores
    public Leao(String classe, String locomocao, String pelo) {
        super(classe, locomocao);
        this.pelo = pelo;
    }

    // Métodos
    public void exibirInformacoes() {
        System.out.println("Classe: " + getClasse());
        System.out.println("Locomoção: " + getLocomocao());
        System.out.println("Pelo: " + getPelo());
    }

    // Getters and setters
    public String getPelo() {
        return pelo;
    }
}
