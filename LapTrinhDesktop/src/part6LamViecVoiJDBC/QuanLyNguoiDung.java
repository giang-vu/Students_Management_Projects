/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6LamViecVoiJDBC;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giang Vu
 */
public class QuanLyNguoiDung {

    /**
     * Ham lay thong tin nguoi dung theo UserID
     *
     * @param userID ID cua nguoi dung
     * @return thong tin doi tuong nguoi dung
     */
    public NguoiDung layThongTinNguoiDung(int userID) {
        // Khai bao 1 doi tuong nguoi dung
        NguoiDung objND = null;

        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh can truy van
            String strSQL = "SELECT UserId, TenDangNhap, MatKhau, HoTen, DienThoai, Email, DiaChi, Quyen FROM nguoidung WHERE UserID = '" + userID + "'";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = comm.executeQuery(strSQL);

            while (rs.next()) {
                // Khoi tao
                objND = new NguoiDung();

                // Gan gia tri cho cac thuoc tinh lay duoc tu database
                objND.setUserID(rs.getInt("UserID"));
                objND.setTenDangNhap(rs.getString("TenDangNhap"));
                objND.setMatKhau(rs.getString("MatKhau"));
                objND.setHoTen(rs.getString("HoTen"));
                objND.setDienThoai(rs.getString("DienThoai"));
                objND.setEmail(rs.getString("Email"));
                objND.setDiaChi(rs.getString("DiaChi"));
                objND.setQuyen(rs.getString("Quyen"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } finally // Sau khi thuc hien xong thi dong ket noi
        {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return objND;
    }

    /**
     * Ham lay thong tin nguoi dung theo ten dang nhap
     *
     * @param tenDangNhap ten dang nhap can tim
     * @return doi tuong nguoi dung
     */
    public NguoiDung layThongTinNguoiDung(String tenDangNhap) {
        // Khai bao 1 doi tuong nguoi dung
        NguoiDung objND = null;

        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh can truy van
            String strSQL = "SELECT UserId, TenDangNhap, MatKhau, HoTen, DienThoai, Email, DiaChi, Quyen FROM nguoidung WHERE TenDangNhap = '" + tenDangNhap + "'";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = comm.executeQuery(strSQL);

            while (rs.next()) {
                // Khoi tao
                objND = new NguoiDung();

                // Gan gia tri cho cac thuoc tinh lay duoc tu database
                objND.setUserID(rs.getInt("UserID"));
                objND.setTenDangNhap(rs.getString("TenDangNhap"));
                objND.setMatKhau(rs.getString("MatKhau"));
                objND.setHoTen(rs.getString("HoTen"));
                objND.setDienThoai(rs.getString("DienThoai"));
                objND.setEmail(rs.getString("Email"));
                objND.setDiaChi(rs.getString("DiaChi"));
                objND.setQuyen(rs.getString("Quyen"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } finally // Sau khi thuc hien xong thi dong ket noi
        {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return objND;
    }

    /**
     * Ham cap nhap thong tin nguoi dung
     *
     * @param objND doi tuong nguoi dung can cap nhap thong tin
     * @return True neu cap nhap thanh cong, False neu that bai
     */
    public boolean capNhapThongTin(NguoiDung objND) {
        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh can truy van
            String strUpdate = String.format("UPDATE nguoidung SET HoTen = '%s', DienThoai = '%s', Email = '%s', DiaChi = '%s' WHERE UserID = %d",
                    objND.getHoTen(),
                    objND.getDienThoai(),
                    objND.getEmail(),
                    objND.getDiaChi(),
                    objND.getUserID());

            return comm.executeUpdate(strUpdate) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } finally // Sau khi thuc hien xong thi dong ket noi
        {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    public boolean themNguoiDungMoi(NguoiDung objND) {
        try {
            // Ket noi den database can lam viec
            Connection connection = DataProvider.ketNoi();

            // Khai bao 1 cau lenh MySQL de thuc hien cong viec
            Statement command = connection.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = String.format("INSERT INTO nguoidung(TenDangNhap, MatKhau, HoTen, DienThoai, Email, DiaChi, Quyen)"
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')",
                    objND.getTenDangNhap(), objND.getMatKhau(), objND.getHoTen(), objND.getDienThoai(), objND.getEmail(), objND.getDiaChi(), objND.getQuyen());

            // Neu so dong thuc hien duoc > 0 thi tra ve True, nguoc lai tra ve False;
            return command.executeUpdate(strSQL) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean doiMatKhau(int userID, String matKhauMoi) {
        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh can truy van
            String strUpdate = String.format("UPDATE nguoidung SET MatKhau = '%s' WHERE UserID = %d", matKhauMoi, userID);

            return comm.executeUpdate(strUpdate) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } finally // Sau khi thuc hien xong thi dong ket noi
        {

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    public String maHoaMD5(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(QuanLyNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
