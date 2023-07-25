/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.entity;

/**
 *
 * @author LENOVO
 */
public class HoaDonChiTiet {
    private int maHDCT;
    private String maHoaDonBan;
    private String maSP;
    private int soluong;
    private float giamGia;

    public HoaDonChiTiet(int maHDCT, String maHoaDonBan, String maSP, int soluong, float giamGia) {
        this.maHDCT = maHDCT;
        this.maHoaDonBan = maHoaDonBan;
        this.maSP = maSP;
        this.soluong = soluong;
        this.giamGia = giamGia;
    }

    public HoaDonChiTiet() {
    }

    public int getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(int maHDCT) {
        this.maHDCT = maHDCT;
    }

    public String getMaHoaDonBan() {
        return maHoaDonBan;
    }

    public void setMaHoaDonBan(String maHoaDonBan) {
        this.maHoaDonBan = maHoaDonBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }
   
}
