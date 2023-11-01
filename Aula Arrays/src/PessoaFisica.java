public class PessoaFisica extends Pessoa {
    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | Tipo: Pessoa Física";
    }
}
