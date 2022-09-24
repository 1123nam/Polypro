package com.polypro.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.polypro.model.HocVien;
import com.polypro.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luong
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer> {
    String INSERT_SQL = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=?";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    String SELECT_BY_ID = "SELECT * FROM HocVien WHERE MaHV=?";
    String SELECT_BY_KHOAHOC ="SELECT * FROM HocVien WHERE MaKH = ?";
   @Override
    public void insert(HocVien model) {
        
       try {
           JdbcHelper.update(INSERT_SQL, model.getMaKH(), model.getMaNH(), model.getDiem());
       } catch (SQLException ex) {
           Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    @Override
    public void update(HocVien model) {
       try {
           JdbcHelper.update(UPDATE_SQL, model.getMaKH(), model.getMaNH(), model.getDiem(), model.getMaHV());
       } catch (SQLException ex) {
           Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    @Override
    public void delete(Integer MaHV) {
       try {
           JdbcHelper.update(DELETE_SQL, MaHV);
       } catch (SQLException ex) {
           Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    @Override
    public List<HocVien> select() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectID(Integer mahv) {
        List<HocVien> list = this.selectBySql(SELECT_BY_ID, mahv);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getDouble("Diem"));
                list.add(entity);
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<HocVien> selectByKhoaHoc(int makh){

        return this.selectBySql(SELECT_BY_KHOAHOC, makh);
    }
    
}

