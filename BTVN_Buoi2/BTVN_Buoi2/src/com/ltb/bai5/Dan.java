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
public class Dan implements ICommon{
    
    float satThuong;

    public float getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(float satThuong) {
        this.satThuong = satThuong;
    }    
    
    @Override
    public void diChuyen() {
        System.out.println("Dan di chuyen!!!");
    }
    public void no(){
        System.out.println("Boom");
    }
    
}
