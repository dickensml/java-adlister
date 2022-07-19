import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class MySQLDao implements Ads{

    private Connection connection;

    public MySQLDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
