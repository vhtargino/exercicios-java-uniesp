import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CidadeDAO {
    private Connection connection;

    public CidadeDAO() {
        this.connection = new Conexao().GeraConexao();
    }

    public void adiciona(Cidade c) {
        String sql = "INSERT INTO cidades(id_cidade, nome_cidade, estado) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getIdCidade());
            stmt.setString(2, c.getNomeCidade());
            stmt.setString(3, c.getEstado());
            stmt.execute();
            stmt.close();
            System.out.println("Cidade adicionada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
