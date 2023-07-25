/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.dao;

import com.dua1noficel.entity.Nhanvien;
import com.dua1noficel.utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class NhanVienDAO extends MainDAO<Nhanvien, String> {

    final String INSERT_SQL = "Insert into NhanVien(MaNV,TenNV,GioiTinh, DiaChi,DienThoai,NgaySinh,MatKhau,VaiTro)  values (?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "UpDate NhanVien set TenNV=?,GioiTinh=?, DiaChi=?,DienThoai=?,"
            + "NgaySinh=?,MatKhau=?,VaiTro=?  where MaNV=?";
    final String DELETE_SQL = "DELETE from NhanVien where MaNV = ?";
    final String SELECT_ALL_SQL = "select * from NhanVien";
    final String SELECT_BY_ID_SQL = "select * from NhanVien where MaNV = ?";

    @Override
    public void insert(Nhanvien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.getGioiTinh(), entity.getDiaChi(), entity.getDienThoai(),
                entity.getNgaySinh(), entity.getMatKhau(), entity.getVaiTro());
    }

    @Override
    public void update(Nhanvien entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getHoTen(), entity.getGioiTinh(), entity.getDiaChi(), entity.getDienThoai(),
                entity.getNgaySinh(), entity.getMatKhau(), entity.getVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Nhanvien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Nhanvien selectById(String id) {
        List<Nhanvien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Nhanvien> selectBySql(String sql, Object... args) {
        List<Nhanvien> List = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Nhanvien entity = new Nhanvien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("TenNV"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                List.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return List;
    }
}
