import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;
import org.junit.Test;

import static org.junit.Assert.*;

public class JDBCTest {
    JDBC jdbc = new JDBC();

    @Test
    public void connect() {}

    @Test
    public void getTeamListFromRegion() {
        System.out.println(jdbc.getTeamListFromRegion("east"));
    }

    @Test
    public void parseToStringArray() {
    }

    @Test
    public void mapify() {
    }
}