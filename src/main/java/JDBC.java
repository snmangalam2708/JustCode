import java.sql.*;

public class JDBC {
    private final String url = "";
    private final String user = "";
    private final String password = "";

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

    public String getTeamList() {
        String SQL = "SELECT * FROM school_name";
        String teamList = "";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            teamList = rs.getString("school_name");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return teamList;
    }
}
