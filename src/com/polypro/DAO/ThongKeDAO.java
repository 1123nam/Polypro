/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.DAO;

import com.polypro.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luong
 */
public class ThongKeDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Object[]> getBangDiem(Integer maKH) {

        String sql = "{CALL sp_BangDiem(?)}";
        String[] cols = {"MaNH", "HoTen", "Diem"};

        return this.getListOfArray(sql, cols, maKH);
    }

    public List<Object[]> getLuongNguoiHoc() {

        String sql = "{CALL sp_ThongKeNguoiHoc}";
        String[] cols = {"Nam", "SoLuong", "DauTien", "CuoiCung"};

        return this.getListOfArray(sql, cols);
    }

    public List<Object[]> getDiemChuyenDe() {

        String sql = "{CALL sp_ThongKeDiem}";
        String[] cols = {"ChuyenDe", "SoHV", "ThapNhat", "CaoNhat", "TrungBinh"};

        return this.getListOfArray(sql, cols);
    }

    public List<Object[]> getDoanhThu(int nam) {
        String sql = "{CALL sp_ThongKeDoanhThu(?)}";
        String[] cols = {"ChuyenDe", "SoKH", "SoHV","DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};

        return this.getListOfArray(sql, cols, nam);
    }

}
