import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    private final String url = "";
    private final String user = "";
    private final String password = "";

    //connect to postGres database

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to SQL server.");

            } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }


}
