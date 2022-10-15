/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polypro.model;

public class NhanVien {
    private String maNV;
    private String matKhau;
    private String hoTen;
    private boolean vaiTro = false;
    private String hinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String hoTen, String hinh) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.hinh = hinh;
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
}
