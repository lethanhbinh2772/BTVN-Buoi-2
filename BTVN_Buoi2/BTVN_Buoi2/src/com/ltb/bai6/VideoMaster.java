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
public class VideoMaster extends Media {
    
    private VideoMaster Video1;
    private VideoMaster Video2;
    private String hangSanXuat;

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
      
    @Override
    public void play() {
        System.out.println("play video");
    }

    @Override
    public void pause() {
        System.out.println("pause video");
    }

    @Override
    public void stop() {
        System.out.println("stop video");
    }

    @Override
    public void seek() {
        System.out.println("seek video");
    }

    @Override
    public void next() {
        System.out.println("next video");
    }

    @Override
    public void previous() {
        System.out.println("previous video");
    }

    @Override
    public void delete() {
        System.out.println("delete video");
    }

    @Override
    public void infoSetting() {
        Video1.setTen("The Flash");
        Video1.setTheLoai("Phim");
        Video1.setThoiLuong(2750f);
        Video1.setHangSanXuat("My Tho");
        Video1.setChatLuong("Full HD");
        
        Video2.setTen("Chua co du lieu");
        Video2.setTheLoai("Chua co du lieu");
        Video2.setThoiLuong(0f);
        Video2.setHangSanXuat("Chua co du lieu");
        Video2.setChatLuong("Chua co du lieu");
    }

    @Override
    public void infoDisplay() {
        System.out.println("Ten video: "+Video1.getTen()
                + "The loai: "+Video1.getTheLoai()
                + "Thoi luong: "+Video1.getChatLuong()
                + "Hang san xuat: "+Video1.getHangSanXuat()
                + "Chat luong: "+Video1.getChatLuong());
        
        System.out.println("Ten video: "+Video2.getTen()
                + "The loai: "+Video2.getTheLoai()
                + "Thoi luong: "+Video2.getChatLuong()
                + "Hang san xuat: "+Video2.getHangSanXuat()
                + "Chat luong: "+Video2.getChatLuong());
    }

    @Override
    public void importMedia() {
        System.out.println("Please choose video to import");
    }

    @Override
    public void listMediaView() {
        System.out.println("Viewing video list");
    }
    
    public void sortByTopics() {
        System.out.println("sort by topics");
    } 
    
    public void zoomVideo() {
        System.out.println("zooming");
    }
    
    public void changeQuality() {
        System.out.println("changing quality");
    }
}
