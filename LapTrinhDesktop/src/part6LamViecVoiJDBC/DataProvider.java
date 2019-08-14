/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6LamViecVoiJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Giang Vu
 */
public class DataProvider {
    // Su dung driver mysql-connector-java-5.1.47 vi drive 8.0 bi loi compatible
    private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/quanlysinhvien?autoReconnect=true&useSSL=false";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "12345.abcdE";
    /**
     * Khai bao 1 doi tuong kieu static thuoc lop QuanLySinhVien de co the goi
     * va dung doi tuong nay o nhieu noi
     */
    private static QuanLySinhVien _QLSinhVien;

    public static QuanLySinhVien QLSinhVien() {
        if (_QLSinhVien == null) {
            _QLSinhVien = new QuanLySinhVien();
        }
        return _QLSinhVien;
    }

    /**
     * Ham ket noi voi database can lam viec trong MySQL
     *
     * @return doi tuong ket noi
     */
    public static Connection ketNoi() {

        // Khai bao 1 doi tuong ket noi
        Connection connection = null;

        try {
            // Nap driver lam viec voi MySQL vao
            Class.forName(JDBC_DRIVER);

            // Ket noi den database can lam viec
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            System.err.println("Khong ket noi duoc voi MySQL. Chi tiet loi: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("Khong tim thay driver cua MySQL. Chi tiet loi: " + ex.getMessage());
        }
        return connection;
    }
}
