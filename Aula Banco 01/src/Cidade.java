public class Cidade {
    // Atributos
    private int idCidade;
    private String nomeCidade;
    private String estado;

    // Construtor
    public Cidade() {
    }

    // Getters e setters
    public int getIdCidade() {
        return idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
