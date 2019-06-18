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
public class Lion extends Animal {

    private Lion lion;
    private float foodConsumption;

    public float getFoodConsumption() {
        return foodConsumption;
    }

    public void setFoodConsumption(float foodConsumption) {
        this.foodConsumption = foodConsumption;
    }

    public void Leo() {

        lion.setAnimalName("Leo");
        lion.setAnimalWeight(300f);
        lion.setFoodConsumption(5f);

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(lion.getAnimalName());
        System.out.println(lion.getAnimalWeight());
        System.out.println(lion.getFoodConsumption());
    }

}
