/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.dao;

import com.dua1noficel.entity.KhachHang;
import com.dua1noficel.entity.SanPham;
import com.dua1noficel.utils.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class KhachhangDAO extends MainDAO<KhachHang,String>{
    final String INSERT_SQL = "insert into KhachHang(MaKH,TenKH,DiaChi,Sdt,Email,Thanhvien) values (?,?,?,?,?,?)";
    final String UPDATE_SQL = "update KhachHang set TenKH =?,DiaChi=?,Sdt=?,Email=?,Thanhvien=? where MaKH =?";
    final String DELETE_SQL = "delete from KhachHang where MaKH = ?";
    final String SELECT_ALL_SQL = "select * from KhachHang";
    final String SELECT_BY_ID_SQL = "select * from KhachHang where MaKH = ?";

    @Override
    public void insert(KhachHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaKH(),entity.getTenKH(),entity.getDiaChi(),entity.getSdt(),entity.getEmail(),entity.isThanhVien());
    }

    @Override
    public void update(KhachHang entity) {
         JDBCHelper.update(UPDATE_SQL,entity.getTenKH(),entity.getDiaChi(),entity.getSdt(),entity.getEmail(),entity.isThanhVien(),entity.getMaKH());
    }

    @Override
    public void delete(String id) {
         JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = selectBySql(SELECT_BY_ID_SQL, id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
      List<KhachHang> List = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setSdt(rs.getString("Sdt"));
                entity.setEmail(rs.getString("Email"));
                entity.setThanhVien(rs.getBoolean("Thanhvien"));
                List.add(entity);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return List;

    
    }
}
