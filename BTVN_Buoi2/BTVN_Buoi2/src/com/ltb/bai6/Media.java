/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai6;

/**
 *
 * @author ZzZ
 */
public abstract class Media {
    
    String ten;
    String theLoai;
    String chatLuong;
    float thoiLuong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    public float getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(float thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
      
    abstract public void importMedia();
    abstract public void listMediaView();
    abstract public void play();
    abstract public void pause();
    abstract public void stop();
    abstract public void seek();
    abstract public void next();
    abstract public void previous();
    abstract public void delete();
    abstract public void infoSetting();
    abstract public void infoDisplay();

}
