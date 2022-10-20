/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polypro.model;

import com.polypro.utils.XFile;
import java.io.Serializable;

public class NhanVien implements Serializable {

    private String maNV;
    private String matKhau;
    private String hoTen;
    private boolean vaiTro = false;
    private String hinh;
    private int number;
    private String path = "DataUpdateAnh_NhanVien.txt";
    
    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, String hinh, int number) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.hinh = hinh;
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", vaiTro=" + vaiTro + ", hinh=" + hinh + '}';
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public void loadFile() throws Exception {
        number = XFile.readInt(path);
    }

    public void writeFile() throws Exception {
        XFile.writeInt(path, number);
    }
}
