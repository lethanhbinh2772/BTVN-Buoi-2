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
public class NewMain {

    public static void main(String[] args) {
        
        Media mediaMusic = new SongMaster();
        Media mediaVideo = new VideoMaster();
        
        mediaMusic.infoDisplay();
        mediaVideo.infoDisplay();

    }

}
