package com.polypro.DAO;



import com.polypro.utils.JdbcHelper;
import com.polypro.model.NguoiHoc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {
//test commit
    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV)VALUES( ?,  ?,  ?,  ?,  ?,  ?,  ?,  ?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?,MaNV =  ? WHERE  MaNH =  ? ";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_KEYWORD = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
    String selectByCourse = "SELECT * FROM NguoiHoc WHERE MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
    String selectById = "SELECT * FROM NguoiHoc WHERE MaNH=?";
    String selectNotInCourse ="SELECT * FROM NguoiHoc WHERE HoTen LIKE ? and MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH = ?)";
    @Override
    public void insert(NguoiHoc model) {
        try {
            JdbcHelper.update(INSERT_SQL,
                    model.getMaNH(),
                    model.getHoTen(),
                    model.getNgaySinh(),
                    model.isGioiTinh(),
                    model.getDienThoai(),
                    model.getEmail(),
                    model.getGhiChu(),
                    model.getMaNV());
        } catch (SQLException e) {
        }

    }

    @Override
    public void update(NguoiHoc model) {
        try {
            JdbcHelper.update(UPDATE_SQL,
                    model.getHoTen(),
                    model.getNgaySinh(),
                    model.isGioiTinh(),
                    model.getDienThoai(),
                    model.getEmail(),
                    model.getGhiChu(),
                    model.getMaNV(),
                    model.getMaNH());
        } catch (SQLException e) {
        }

    }

    @Override
    public void delete(String id) {
        try {
            JdbcHelper.update(DELETE_SQL, id);
        } catch (SQLException e) {
        }

    }

    @Override
    public List<NguoiHoc> select() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        return this.selectBySql(SELECT_BY_KEYWORD, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectByCourse(Integer makh) {
        return this.selectBySql(selectByCourse, makh);
    }

    @Override
    public NguoiHoc selectID(String id) {
        List<NguoiHoc> list = this.selectBySql(selectById, id);
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
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

        public List<NguoiHoc> selectNotInCourse(int makh, String keyword){
        
        return this.selectBySql(selectNotInCourse, "%"+keyword+"%",makh);
    }
       
}
