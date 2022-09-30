package com.polypro.DAO;

import com.polypro.utils.JdbcHelper;
import com.polypro.model.KhoaHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//đổi tên file lại vì bị lỗi 16h44 ngày 20/9/2022

public class KhoaHocDAO extends EduSysDAO<KhoaHoc, Integer> {

    String INSERT_SQL = "INSERT INTO KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?,?)";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD=?, HocPhi=?, ThoiLuong=?, NgayKG=?, GhiChu=?, MaNV=? WHEREMaKH=?";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH=?";
    String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc";
    String SELECT_BY_ID = "SELECT * FROM KhoaHoc WHERE MaKH=?";
    String SELECT_BY_CHUYENDE = "SELECT * FROM KhoaHoc WHERE MaCD = ?";
    String SELECT_YEARS = "SELECT DISTINCT year(NGAYKG) as  YEAR FROM KHOAHOC ORDER BY YEAR DESC";

    @Override
    public void insert(KhoaHoc model) {
        try {
            JdbcHelper.update(INSERT_SQL,
                    model.getMaCD(),
                    model.getHocPhi(),
                    model.getThoiLuong(),
                    model.getNgayKG(),
                    model.getGhiChu(),
                    model.getMaNV());
        } catch (SQLException e) {
        }

    }

    @Override
    public void update(KhoaHoc model) {
        try {
            JdbcHelper.update(UPDATE_SQL,
                    model.getMaCD(),
                    model.getHocPhi(),
                    model.getThoiLuong(),
                    model.getNgayKG(),
                    model.getGhiChu(),
                    model.getMaNV(),
                    model.getMaKH());
        } catch (SQLException e) {
        }

    }

    @Override
    public void delete(Integer MaKH) {

        try {
            JdbcHelper.update(DELETE_SQL, MaKH);
        } catch (SQLException e) {
        }

    }

    @Override
    public List<KhoaHoc> select() {

        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhoaHoc selectID(Integer id) {
        List<KhoaHoc> list = this.selectBySql(SELECT_BY_ID, id); // đang lỗi 
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

    public List<KhoaHoc> selectByChuyenDe(String macd) {

        return this.selectBySql(SELECT_BY_CHUYENDE, macd);
    }

    public List<Integer> selectYears() {
        List<Integer> list = new ArrayList<>();

        try {
            ResultSet rs = JdbcHelper.query(SELECT_YEARS);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
