public class Animal {
    protected String classe;
    protected String locomocao;

    // Construtores
    public Animal() {
    }

    public Animal(String classe, String locomocao) {
        this.classe = classe;
        this.locomocao = locomocao;
    }

    // Getters and setters
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }
}
