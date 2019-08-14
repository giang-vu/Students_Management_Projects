/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part6LamViecVoiJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giang Vu
 */
public class QuanLyChuyenKhoa {

    /**
     * Ham lay danh sach khoa
     *
     * @return danh sach khoa
     */
    public List<ChuyenKhoa> layDanhSachKhoa() {
        // Khai bao 1 danh sach khoa
        List<ChuyenKhoa> lstKhoa = new ArrayList();

        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            // Ket noi den database can lam viec
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = "SELECT MaKhoa, TenKhoa FROM chuyenkhoa";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = comm.executeQuery(strSQL);

            // Dung vong lap de doc tung dong roi dua ve danh sach
            ChuyenKhoa objKhoa = null;
            while (rs.next()) {
                objKhoa = new ChuyenKhoa();
                objKhoa.setMaKhoa(rs.getString("MaKhoa"));
                objKhoa.setTenKhoa(rs.getString("TenKhoa"));

                lstKhoa.add(objKhoa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyChuyenKhoa.class.getName()).log(Level.SEVERE, null, ex);
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
        return lstKhoa;
    }

    /**
     * Ham lay thong tin chi tiet doi tuong khoa theo ma
     * @param maKhoa Ma khoa can lay thong tin
     * @return Doi tuong khoa
     */
    public ChuyenKhoa timKiemKhoaTheoMa(String maKhoa) {
        // Khai bao 1 doi tuong khoa
        ChuyenKhoa objKhoa = null;
        
        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = "SELECT MaKhoa, TenKhoa FROM chuyenkhoa WHERE MaKhoa = '" + maKhoa + "'";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = comm.executeQuery(strSQL);

            while (rs.next()) {
                objKhoa = new ChuyenKhoa();
                objKhoa.setMaKhoa(rs.getString("MaKhoa"));
                objKhoa.setTenKhoa(rs.getString("TenKhoa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyChuyenKhoa.class.getName()).log(Level.SEVERE, null, ex);
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
        return objKhoa;
    }
}
