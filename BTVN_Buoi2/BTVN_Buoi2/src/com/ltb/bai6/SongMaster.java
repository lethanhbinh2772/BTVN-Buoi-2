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
public class SongMaster extends Media {
    
    private SongMaster Song1;
    private SongMaster Song2;
    private String album;
    private String performer;

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }    

    @Override
    public void play() {
        System.out.println("play song");
    }

    @Override
    public void pause() {
        System.out.println("pause song");
    }

    @Override
    public void stop() {
        System.out.println("stop song");
    }

    @Override
    public void seek() {
        System.out.println("seek song");
    }

    @Override
    public void next() {
        System.out.println("next song");
    }

    @Override
    public void previous() {
        System.out.println("previous song");
    }

    @Override
    public void delete() {
        System.out.println("delete song");
    }

    @Override
    public void infoSetting() {
        Song1.setTen("Anh van doi cho");
        Song1.setTheLoai("Nhac tre");
        Song1.setThoiLuong(296f);
        Song1.setPerformer("Dan Truong");
        Song1.setAlbum("Anh yeu em");
        Song1.setChatLuong("128kbs");
        
        Song2.setTen("Anh sai roi");
        Song2.setTheLoai("Nhac tre");
        Song2.setThoiLuong(272f);
        Song2.setPerformer("Cao Thai Son");
        Song2.setAlbum("Anh sai");
        Song2.setChatLuong("320kbs");
    }

    @Override
    public void infoDisplay() {
        System.out.println("Ten bai hat: "+Song1.getTen()
                + "The loai nhac: "+Song1.getTheLoai()
                + "Thoi luong: "+Song1.getThoiLuong()+ " giay"
                + "Ca si: "+Song1.getPerformer()
                + "Album: "+Song1.getAlbum()
                + "Chat luong: "+Song1.getChatLuong());
        
        System.out.println("Ten bai hat: "+Song2.getTen()
                + "The loai nhac: "+Song2.getTheLoai()
                + "Thoi luong: "+Song2.getThoiLuong()+ " giay"
                + "Ca si: "+Song2.getPerformer()
                + "Album: "+Song2.getAlbum()
                + "Chat luong: "+Song2.getChatLuong());
    }

    @Override
    public void importMedia() {
        System.out.println("Please choose song to import");
    }

    @Override
    public void listMediaView() {
        System.out.println("Viewing song list.");
    }
    
    
}
