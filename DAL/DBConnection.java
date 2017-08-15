package DAL;
import java.sql.*;
public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String User = "root";
    private static final String Password = "";

    public static Connection getConnection() throws SQLException {
        try {
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection(URL, User, Password);
        } catch (SQLException sqlex) {
            throw new SQLException("DBConnection:getConnection() Nuk mund te lidhet me baze!");
        }
    }
}
