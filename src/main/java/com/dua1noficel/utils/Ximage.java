/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dua1noficel.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author LENOVO
 */
public class Ximage {
    public static Image getAppIcon(){
        URL url = Ximage.class.getResource("/com/dua1noficel/icon/computer.png");
        return new ImageIcon(url).getImage();
    }
    public static boolean save(File src){
        File dst = new File("src\\main\\resources\\com\\dua1noficel\\logos",src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();//tao thu muc
        }
        try{
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public  static ImageIcon read(String fileName){
        File path = new File("src\\main\\resources\\com\\dua1noficel\\logos",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
