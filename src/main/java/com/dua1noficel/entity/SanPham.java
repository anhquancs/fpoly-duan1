/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.entity;

/**
 *
 * @author LENOVO
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float dongiaBan;
    private String Anh;
    private String ghiChu;
    private int maDM;
    private String size;

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDongiaBan() {
        return dongiaBan;
    }

    public void setDongiaBan(float dongiaBan) {
        this.dongiaBan = dongiaBan;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public SanPham(String maSP, String tenSP, int soLuong, float dongiaBan, String Anh, String ghiChu, int maDM, String size) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.dongiaBan = dongiaBan;
        this.Anh = Anh;
        this.ghiChu = ghiChu;
        this.maDM = maDM;
        this.size = size;
    }

    public SanPham() {
    }
    
    @Override
    public String toString() {
        return this.getTenSP();
    }
}
