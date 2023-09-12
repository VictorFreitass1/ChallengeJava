package pamv.com.banco;

import org.junit.Test;
import java.sql.Connection;

public class ConnectionFactoryTest {

    @Test
    public void testGetConnection() {
        Connection connection = ConnectionFactory.getConnection();
        try {
            connection.close();
        } catch (Exception e) {
        	
        }
    }
}
