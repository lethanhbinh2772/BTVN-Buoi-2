/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai5;

/**
 *
 * @author ZzZ
 */
public class XeTangDich implements ICommon,ITank {
    
    String loaiXeTang;

    @Override
    public void diChuyen() {
        System.out.println("Xe tang dich chuyen!!!");
    }

    @Override
    public void ban() {
        System.out.println("Ban!!!");
    }

    @Override
    public boolean kiemTraTrungDan() {
      boolean isShot = true;
      return isShot;
    }
    
    public void phaHuyBot(){
        System.out.println("Pha huy bot!!!");
    }
    
}
