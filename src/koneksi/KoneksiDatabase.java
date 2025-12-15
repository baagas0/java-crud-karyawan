package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDatabase {

    public static Connection BukaKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/karyawan?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";

            Connection cn = DriverManager.getConnection(url, user, pass);
            return cn;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed:\n" + e.getMessage());
            return null;
        }
    }
}
