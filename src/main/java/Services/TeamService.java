package Services;

import Mappers.StringMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TeamService {

    DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://ec2-34-234-228-127.compute-1.amazonaws.com:5432/ddfhhtaevl68hh?user=burfsbhaqlrifa&password=e044d15c0779e11d30010b7062dc64be3b3b57c9bd3007c656a126b48f78e05d", "burfsbhaqlrifa", "e044d15c0779e11d30010b7062dc64be3b3b57c9bd3007c656a126b48f78e05d");
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

    public String getTeamNameByTeamIdRegionName(int teamId, String regionName){
        return jdbcTemplate.query("select name from ncaa_teams_" + regionName + " where teamid = " + teamId+ ";", new StringMapper()).get(0);
    }
}
