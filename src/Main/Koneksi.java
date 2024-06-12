package Main;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriel Marcellino Sinurat - 22552011043
 */
public class Koneksi {

    private static java.sql.Connection koneksi;

    public static java.sql.Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/penjualan";
                String user = "root";
                String password = "";

                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Error Pada Koneksi");
            }
        }
        return koneksi;
    }
}
