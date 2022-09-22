/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.DAO;

import com.polypro.helper.JdbcHelper;
import com.polypro.model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class NhanVienDAO extends abstractDAO<NhanVien, String>{
@Override
 public void insert(NhanVien model){
    String sql="INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
    try {
        JdbcHelper.update(sql, 
    model.getMaNV(), 
    model.getMatKhau(),
    model.getHoTen(), 
    model.isVaiTro());
    } catch (Exception e) {
    }
    
}
@Override
 public void update(NhanVien model){
    String sql="UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
    try {
         JdbcHelper.update(sql, 
    model.getMatKhau(), 
    model.getHoTen(), 
    model.isVaiTro(),
    model.getMaNV());
    } catch (Exception e) {
    }
   
   
 }
 @Override
 public void delete(String MaNV){
    String sql="DELETE FROM NhanVien WHERE MaNV=?";
     try {
         JdbcHelper.update(sql, MaNV);
     } catch (Exception e) {
     }
    
 }
 @Override
 public List<NhanVien> select(){
    String sql="SELECT * FROM NhanVien";
    return select(sql);
 }
 
 public NhanVien findById(String manv){
    String sql="SELECT * FROM NhanVien WHERE MaNV=?";
    List<NhanVien> list = select(sql, manv);
    return list.size() > 0 ? list.get(0) : null;
 }
 
 private List<NhanVien> select(String sql, Object...args){
    List<NhanVien> list=new ArrayList<>();
    try {
    ResultSet rs = null;
    try {
    rs = JdbcHelper.query(sql, args);
    while(rs.next()){
    NhanVien model=readFromResultSet(rs);
    list.add(model);
    }
    } 
    finally{
    rs.getStatement().getConnection().close();
    }
    } 
    catch (SQLException ex) {
    throw new RuntimeException(ex);
    }
 return list;
 }
 
 private NhanVien readFromResultSet(ResultSet rs) throws SQLException{
    NhanVien model=new NhanVien();
    model.setMaNV(rs.getString("MaNV"));
    model.setMatKhau(rs.getString("MatKhau"));
    model.setHoTen(rs.getString("HoTen"));
    model.setVaiTro(rs.getBoolean("VaiTro"));
    return model;
 }

    @Override
    public NhanVien selectID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
