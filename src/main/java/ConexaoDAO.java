
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    public Connection conectaBD () {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/dbinfox?user=root&password=4776";
            conn = DriverManager.getConnection(url);
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO"+ erro.getMessage());
        }
        return conn;
    }
}
