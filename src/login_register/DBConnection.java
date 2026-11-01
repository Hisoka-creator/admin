package login_register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static final String DB_URL =
            "jdbc:mysql://localhost:3306/school_system";

    static final String USER = "root";
    static final String PASS = "";

    public static Connection connectDB() {
        try {
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            System.out.println("Database connection failed!");
            ex.printStackTrace();
            return null;
        }
    }
}