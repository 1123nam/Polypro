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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChuyenDeDAO extends abstractDAO<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO CHUYENDE(MACD, TENCD, HOCPHI, THOILUONG, HINH, MOTA) VALUES (?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE CHUYENDE SET TENCD = ?, HOCPHI = ?, THOILUONG = ?, HINH=?, MOTA =? WHERE MACD = ?";
    String DELETE_SQL = "DELETE FROM CHUYENDE WHERE MACD = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CHUYENDE";
    String SELECT_BY_ID_SQL = "SELECT * FROM CHUYENDE WHERE MACD = ?";

    @Override
    public void insert(ChuyenDe entity) {
       
        try {
            JdbcHelper.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa());
        } catch (Exception ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChuyenDe model) {
      
        try {
            JdbcHelper.update(UPDATE_SQL,
                    model.getTenCD(),
                    model.getHocPhi(),
                    model.getThoiLuong(),
                    model.getHinh(),
                    model.getMoTa(),
                    model.getMaCD()
            );
        } catch (Exception e) {
        }

    }

    @Override
    public void delete(String MaCD) {
        try {
            JdbcHelper.update(DELETE_SQL, MaCD);
        } catch (Exception e) {
        }

    }

    @Override
    public List<ChuyenDe> select() {
        
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectID(String id) {
        
        List<ChuyenDe> list = this.selectBySql(SELECT_BY_ID_SQL, id);
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
