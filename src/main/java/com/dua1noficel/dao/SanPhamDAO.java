/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.dao;

import com.dua1noficel.utils.JDBCHelper;
import java.util.List;
import com.dua1noficel.entity.SanPham;
import java.sql.Array;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class SanPhamDAO extends MainDAO<SanPham, String> {

    final String INSERT_SQL = "insert into SanPham(MaSP,TenSP,SoLuong,DonGiaBan,Anh,GhiChu,MaDM,Size) values (?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update SanPham set TenSP = ?, SoLuong = ?,DonGiaBan = ?,Anh = ?,GhiChu =?,MaDM=?,Size=? Where MaSP = ?";
    final String DELETE_SQL = "DELETE from SanPham where MaSP = ?";
    final String SELECT_ALL_SQL = "select * from SanPham";
    final String SELECT_BY_ID_SQL = "select * from SanPham where MaSP = ?";

    @Override
    public void insert(SanPham entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaSP(), entity.getTenSP(), entity.getSoLuong(), entity.getDongiaBan(), entity.getAnh(), entity.getGhiChu(),
                entity.getMaDM(), entity.getSize());
    }

    @Override
    public void update(SanPham entity) {
        JDBCHelper.update(UPDATE_SQL, entity.getTenSP(), entity.getSoLuong(), entity.getDongiaBan(), entity.getAnh(), entity.getGhiChu(),
                entity.getMaDM(), entity.getSize(), entity.getMaSP());
    }

    @Override
    public void delete(String id) {
        JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(String id) {
       List<SanPham> list = selectBySql(SELECT_BY_ID_SQL, id);
       if(list.isEmpty()){
           return null;
       }
       return list.get(0);
    }

    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> List = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSP"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setDongiaBan(rs.getFloat("DonGiaBan"));
                entity.setAnh(rs.getString("Anh"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaDM(rs.getInt("MaDM"));
                entity.setSize(rs.getString("Size"));
                List.add(entity);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return List;

    }

}
