package com.polypro.DAO;

import com.polypro.helper.JdbcHelper;
import com.polypro.model.KhoaHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//đổi tên file lại vì bị lỗi 16h44 ngày 20/9/2022

public class KhoaHocDAO extends abstractDAO<KhoaHoc, Integer>{
    @Override
    public void insert(KhoaHoc model) {
        String sql = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?,?)";
        try {
             JdbcHelper.update(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV());
        } catch (Exception e) {
        }
       
    }
    @Override
    public void update(KhoaHoc model) {
        String sql = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHEREMaKH=?";
        try {
             JdbcHelper.update(sql,
                model.getMaCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getNgayKG(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaKH());
        } catch (Exception e) {
        }
       
    }
    
    @Override
    public void delete(Integer MaKH) {
        String sql = "DELETE FROM KhoaHoc WHERE MaKH=?";
        try {
             JdbcHelper.update(sql, MaKH);
        } catch (Exception e) {
        }
       
    }
    
    @Override
    public List<KhoaHoc> select() {
        String sql = "SELECT * FROM KhoaHoc";
        return this.selectBySql(sql);
    }


    @Override
    public KhoaHoc selectID(Integer id) {
        String sql = "SELECT * FROM KhoaHoc WHERE MaKH=?";
        List<KhoaHoc> list = this.selectBySql(sql, id); // đang lỗi 
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
   @Override
    public List<KhoaHoc> selectBySql(String sql, Object... args) {
       List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet result = JdbcHelper.query(sql, args);
            while (result.next()) {
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(result.getInt("MAKH"));
                entity.setHocPhi(result.getFloat("HOCPHI"));
                entity.setThoiLuong(result.getInt("THOILUONG"));
                entity.setNgayKG(result.getDate("NGAYKG"));
                entity.setGhiChu(result.getString("GHICHU"));
                entity.setMaNV(result.getString("MaNV"));
                entity.setNgayTao(result.getDate("NgayTao"));

                entity.setMaCD(result.getString("MACD"));

                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
