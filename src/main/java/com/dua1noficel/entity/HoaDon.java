/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.entity;

import java.sql.Date;

/**
 *
 * @author LENOVO
 */
public class HoaDon {
    private String maHoaDonBan;
    private String maNV;
    private Date ngayBan;
    private String maKH;

    public HoaDon() {
    }

    public String getMaHoaDonBan() {
        return maHoaDonBan;
    }

    public void setMaHoaDonBan(String maHoaDonBan) {
        this.maHoaDonBan = maHoaDonBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public HoaDon(String maHoaDonBan, String maNV, Date ngayBan, String maKH) {
        this.maHoaDonBan = maHoaDonBan;
        this.maNV = maNV;
        this.ngayBan = ngayBan;
        this.maKH = maKH;
    }
}
