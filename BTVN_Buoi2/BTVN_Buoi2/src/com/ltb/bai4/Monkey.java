/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltb.bai4;

/**
 *
 * @author ZzZ
 */
public class Monkey extends Animal{
    
    private Monkey monkey;
    private String favouriteFood;

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
    
    public void George(){
        
        monkey.setAnimalName("George");
        monkey.setAnimalWeight(150f);
        monkey.setFavouriteFood("Banana");
                
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(monkey.getAnimalName());
        System.out.println(monkey.getAnimalWeight());
        System.out.println(monkey.getFavouriteFood());
    }
        
}
