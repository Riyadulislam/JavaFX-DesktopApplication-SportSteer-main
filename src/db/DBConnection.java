package db;

/*
/*This class connects database and javaFX Application
 */

/**
 *
 * @author Dexter Sam
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBConnection {
    
    public static Connection makeconnect() throws SQLException, ClassNotFoundException{
        Connection con = null;
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=SportSteer;selectMethod=cursor", "sa", "34567");
        return con;

    }
    
}
