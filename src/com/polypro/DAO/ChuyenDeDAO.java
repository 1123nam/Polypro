package com.polypro.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.polypro.model.ChuyenDe;
import com.polypro.helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChuyenDeDAO extends abstractDAO<ChuyenDe, String> {

    @Override
    public void insert(ChuyenDe model) {
        String sql = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.update(sql,
                model.getMaCD(),
                model.getTenCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa());
    }

    @Override
    public void update(ChuyenDe model) {
        String sql = "UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
        JdbcHelper.update(sql,
                model.getTenCD(),
                model.getHocPhi(),
                model.getThoiLuong(),
                model.getHinh(),
                model.getMoTa(),
                model.getMaCD()
        );
    }

    @Override
    public void delete(String MaCD) {
        String sql = "DELETE FROM ChuyenDe WHERE MaCD=?";
        JdbcHelper.update(sql, MaCD);
    }

    @Override
    public List<ChuyenDe> select() {
        String sql = "SELECT * FROM ChuyenDe";
        return this.selectBySql(sql);
    }

    @Override
    public ChuyenDe selectID(String id) {
        String sql = "SELECT * FROM ChuyenDe WHERE MaCD=?";
          List<ChuyenDe> list = this.selectBySql(sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChuyenDe> selectBySql(String sql, Object... args) {
         List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet result = JdbcHelper.query(sql, args);
            while (result.next()) {
                ChuyenDe entity = new ChuyenDe();
                entity.setMaCD(result.getString("MACD"));
                entity.setTenCD(result.getString("TENCD"));
                entity.setHocPhi(result.getFloat("HOCPHI"));
                entity.setThoiLuong(result.getInt("THOILUONG"));
                entity.setHinh(result.getString("HINH"));
                entity.setMoTa(result.getString("MOTA"));
                list.add(entity);
            }
            result.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
