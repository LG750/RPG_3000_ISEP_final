package com.isep.rpg;

public class Food extends Consumable{

    // Tous les héros peuvent utiliser de la nourriture.
    // Les healers peuvent utiliser les potions

    private int pointLife;

    public int getPointLife() {
        return pointLife;
    }

    public void setPointLifeFood(int pointLife) {
        this.pointLife = pointLife;
    }

    public Food(String name, int pointLife){
        super(name);
        this.pointLife = pointLife;
    }

}
