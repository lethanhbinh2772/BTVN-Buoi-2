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
public class XeTangTa implements ITank, ICommon {

    int soMang;

    public int getSoMang() {
        return soMang;
    }

    public void setSoMang(int soMang) {
        this.soMang = soMang;
    }

    @Override
    public void diChuyen() {
        System.out.println("Xe tang ta di chuyen");
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

    public void baoVeBot() {
        System.out.println("Bao ve bot!!!");
    }

}
