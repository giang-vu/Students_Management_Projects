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
public class QuanLyQuyenNguoiDung {
    public List<QuyenNguoiDung> layDanhSachQuyen() {
        // Khai bao 1 danh sach khoa
        List<QuyenNguoiDung> lstQuyen = new ArrayList();

        // Ket noi den database can lam viec
        Connection conn = null;

        try {
            // Ket noi den database can lam viec
            conn = DataProvider.ketNoi();

            // Khai bao 1 cau lenh de thuc hien cong viec
            Statement comm = conn.createStatement();

            // Khai bao cau lenh truy van
            String strSQL = "SELECT Quyen, MoTa FROM quyennguoidung";

            // Chua ket qua lay duoc tu cau lenh truy van
            ResultSet rs = comm.executeQuery(strSQL);

            // Dung vong lap de doc tung dong roi dua ve danh sach
            QuyenNguoiDung objQuyen = null;
            while (rs.next()) {
                objQuyen = new QuyenNguoiDung();
                objQuyen.setQuyen(rs.getString("Quyen"));
                objQuyen.setMoTa(rs.getString("MoTa"));

                lstQuyen.add(objQuyen);
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
        return lstQuyen;
    }
}
