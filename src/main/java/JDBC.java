import java.sql.*;
import java.util.HashMap;

public class JDBC {
    // change this to the remote server
    private final String url = "jdbc:postgresql://localhost:5432/testjava";
    private final String user = "java";
    private final String password = "java";

    //connect to postgres database

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

    public String getTeamListFromRegion(String region) {
        //String SQL = "SELECT school_name FROM" + region;
        String SQL = "SELECT first_name FROM person WHERE id < 10";
        String teamList = "";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()){
            //teamList = rs.getString("school_name");
            teamList += rs.getString("first_name") + "\n";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return teamList;
    }

    // need to make this parse query results

    public String[] parseToStringArray(String queryResults){
        return null;
    }
    public HashMap<String, Integer> mapify(String queryResults){
        return new HashMap<String, Integer>();
    }

}
