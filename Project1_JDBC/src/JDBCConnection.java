package src;
import java.sql.*;
public class JDBCConnection {
    public static void main(String[] args) throws SQLException{
        try {
            final String URL ="";
            final String USERNAME="";
            final String PASSWORD="";
            public static Connection getConnection() throws SQLException{
                return DriverManager.getConnection(URL,USERNAME,PASSWORD);
            }
        }
    }
}