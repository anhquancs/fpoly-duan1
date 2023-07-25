/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.ui;

import com.dua1noficel.dao.NhanVienDAO;
import com.dua1noficel.dao.SanPhamDAO;
import com.dua1noficel.entity.Nhanvien;
import com.dua1noficel.entity.SanPham;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class NewClass {
    public static void main(String[] args) {
//        NhanVienDAO dao = new NhanVienDAO();
//        List<Nhanvien> ls = dao.selectAll();
//        for (Nhanvien nv : ls) {
//            System.err.println("=>"+nv.toString());
//        }
SanPhamDAO dao = new SanPhamDAO();
        List<SanPham> ls = dao.selectAll();
        for (SanPham nv : ls) {
            System.err.println("=>"+nv.toString());
        }
    }
}
