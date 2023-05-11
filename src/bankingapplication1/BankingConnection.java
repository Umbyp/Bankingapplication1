package bankingapplication1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

public class BankingConnection {
    public static Connection connect() {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "Sang2012.";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(URL, username, password);

        } catch (SQLException ex) {
            Logger.getLogger(BankingConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BankingConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       return connection;
    }

}
