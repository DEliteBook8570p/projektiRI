package DAL;
import java.sql.*;
public class DBConnection {

    private static final String URL = "jdbc:mysql:10.31.16.107:3306/mydb";
    private static final String User = "admin";
    private static final String Password = "admin";

    public static Connection getConnection() throws SQLException {
        try {
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection(URL, User, Password);
        } catch (SQLException sqlex) {
            throw new SQLException("DBConnection:getConnection() Nuk mund te lidhet me baze!");
        }
    }
}
