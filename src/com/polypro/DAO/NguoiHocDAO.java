package com.polypro.DAO;

import com.polypro.utils.JdbcHelper;
import com.polypro.model.NguoiHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {
//test commit

    @Override
    public void insert(NguoiHoc model) {
        String sql
                = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV)VALUES( ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
        try {
            JdbcHelper.update(sql,
                    model.getMaNH(),
                    model.getHoTen(),
                    model.getNgaySinh(),
                    model.isGioiTinh(),
                    model.getDienThoai(),
                    model.getEmail(),
                    model.getGhiChu(),
                    model.getMaNV());
        } catch (Exception e) {
        }

    }

    @Override
    public void update(NguoiHoc model) {
        String sql = "UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?,MaNV =  ? WHERE  MaNH =  ? ";
        try {
            JdbcHelper.update(sql,
                    model.getHoTen(),
                    model.getNgaySinh(),
                    model.isGioiTinh(),
                    model.getDienThoai(),
                    model.getEmail(),
                    model.getGhiChu(),
                    model.getMaNV(),
                    model.getMaNH());
        } catch (Exception e) {
        }

    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM NguoiHoc WHERE MaNH=?";
        try {
            JdbcHelper.update(sql, id);
        } catch (Exception e) {
        }

    }

    @Override
    public List<NguoiHoc> select() {
        String sql = "SELECT * FROM NguoiHoc";
        return this.selectBySql(sql);
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectByCourse(Integer makh) {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return this.selectBySql(sql, makh);
    }

    @Override
    public NguoiHoc selectID(String id) {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH=?";
        List<NguoiHoc> list = this.selectBySql(sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet result = JdbcHelper.query(sql, args);
            while (result.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(result.getString("MANH"));
                entity.setHoTen(result.getString("HOTEN"));
                entity.setGioiTinh(result.getBoolean("GIOITINH"));
                entity.setNgaySinh(result.getDate("NGAYSINH"));
                entity.setDienThoai(result.getString("DIENTHOAI"));
                entity.setEmail(result.getString("EMAIL"));
                entity.setGhiChu(result.getString("GHICHU"));
                entity.setMaNV(result.getString("MANV"));
                entity.setNgayDK(result.getDate("NGAYDK"));
                list.add(entity);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
