package pamv.com.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pamv.com.dominio.Veiculo;

public class VeiculoDAO {
    private Connection connection;

    public VeiculoDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void inserirVeiculo(Veiculo veiculo) {
        String sql = "INSERT INTO veiculos (nome, marca, modelo, tipoDeCarga, eixos) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        	preparedStatement.setString(1, veiculo.getNome());
        	preparedStatement.setString(2, veiculo.getMarca());
        	preparedStatement.setString(3, veiculo.getModelo());
        	preparedStatement.setString(4, veiculo.getTipoDeCarga());
        	preparedStatement.setInt(5, veiculo.getEixos());
        	preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void atualizarVeiculo(Veiculo veiculo) {
        String sql = "UPDATE veiculos SET nome=?, marca=?, modelo=?, tipoDeCarga=?, eixos=? WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        	preparedStatement.setString(1, veiculo.getNome());
        	preparedStatement.setString(2, veiculo.getMarca());
        	preparedStatement.setString(3, veiculo.getModelo());
        	preparedStatement.setString(4, veiculo.getTipoDeCarga());
        	preparedStatement.setInt(5, veiculo.getEixos());
        	preparedStatement.setInt(6, veiculo.getId());
        	preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void excluirVeiculo(int id) {
        String sql = "DELETE FROM veiculos WHERE id=?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Veiculo obterVeiculoPorId(int id) {
        String sql = "SELECT * FROM veiculos WHERE id=?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return mapearVeiculo(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<Veiculo> obterTodosVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculos";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Veiculo veiculo = mapearVeiculo(rs);
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }

    private Veiculo mapearVeiculo(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nome = rs.getString("nome");
        String marca = rs.getString("marca");
        String modelo = rs.getString("modelo");
        String tipoDeCarga = rs.getString("tipoDeCarga");
        int eixos = rs.getInt("eixos");
        return new Veiculo(id, nome, marca, modelo, tipoDeCarga, eixos);
    }
}