package pamv.com.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

	public static Connection getConnection() {
		String urlDeConexao = "jdbc:h2:./banco/db;AUTO_SERVER=TRUE";
		String login = "sa";
		String senha = "";
		
		try {
			return DriverManager.getConnection(urlDeConexao, login, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
