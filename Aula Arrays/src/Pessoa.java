public abstract class Pessoa {
    protected String nome;
    protected int idade;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // toString
    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade();
    }
}