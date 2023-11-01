public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | CNPJ: " + getCnpj() + " | Tipo: Pessoa Jurídica";
    }
}
