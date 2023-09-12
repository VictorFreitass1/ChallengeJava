package pamv.com.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void inserirCliente(String nome, String email, String senha) {
    	String sql = "INSERT INTO clientes (nome, email, senha) VALUES (?, ?, ?)";
    	
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql))  {
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, senha);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir cliente no banco de dados: " + e.getMessage());
        }
    }
    public boolean verificarLogin(String email, String senha) {
    	String sql = "SELECT nome FROM clientes WHERE email = ? AND senha = ?";
    	
    	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
    		preparedStatement.setString(1, email);
    		preparedStatement.setString(2, senha);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public String getNomeCliente(String email) {
        String sql = "SELECT nome FROM clientes WHERE email = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, email);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
    }
}
