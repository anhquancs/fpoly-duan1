/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.dao;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public abstract class MainDAO<EntityType, KEyType> {

    public abstract void insert(EntityType entity);

    public abstract void update(EntityType entity);

    public abstract void delete(KEyType id);

    public abstract List<EntityType> selectAll();

    public abstract EntityType selectById(KEyType id);

    public abstract List<EntityType> selectBySql(String sql, Object...args);

}
