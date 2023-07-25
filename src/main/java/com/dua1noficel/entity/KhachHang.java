/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.entity;

/**
 *
 * @author LENOVO
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String sdt;
    private String email;
    private boolean thanhVien;

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(boolean thanhVien) {
        this.thanhVien = thanhVien;
    }

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String diaChi, String sdt, String email, boolean thanhVien) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.thanhVien = thanhVien;
    }
}
